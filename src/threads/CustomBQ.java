package threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomBQ<E> {
    private Queue<E> queue;
    private int max;
    private Lock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public CustomBQ(int size) {
        this.queue = new LinkedList<E>();
        this.max = size;
    }

    void put(E e) {
        //acquire lock
        lock.lock();
        try {
            //add element, signal to threads( waiting to pull) after adding element
            //if Q is full - thread has to wait for signal and add element when it receives signal

            while (queue.size() == max) {
                notFull.await();
            }
            queue.add(e);
            notEmpty.signalAll();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            //release lock
            lock.unlock();
        }

    }

    E take() {
        //acquire lock
        lock.lock();
        try {
            //remove element and signal fror other produces to add
            //if Q is empty - thread has to wait for signal
            while (queue.isEmpty()) {
                //when element available, consumer should be able to retreive it
                notEmpty.await();
            }
            E removedItem = queue.remove();
            notFull.signalAll();
            return removedItem;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //release lock
            lock.unlock();
        }
        return null;
    }
}
