package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBQ {

    private BlockingQueue blockingQueue = new ArrayBlockingQueue(1);

    Runnable producer = () -> {
        //while (true){
            System.out.println("Producer Adding item to Q ");
            try {
                blockingQueue.put(createItem());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        //}
    };

    final Runnable consumer = () -> {
        //while (true){
            try {
                System.out.println("Consumer Pulling item from Q ");
                Double item = (Double) blockingQueue.take();
                System.out.println("Consumer Pulling item from Q :: "+item);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        //}
    };

    private static double createItem() {
        return Math.random();
    }

    public static void main(String args[]) throws InterruptedException {

        ProducerConsumerUsingBQ pc = new ProducerConsumerUsingBQ();
        System.out.println("pc Q size :: "+pc.blockingQueue.size());

        new Thread(pc.consumer).start();
        Thread.sleep(1000);
        new Thread(pc.consumer).start();
        Thread.sleep(1000);
       new Thread(pc.producer).start();
        Thread.sleep(1000);
        new Thread(pc.consumer).start();
        Thread.sleep(1000);
     /*    new Thread(pc.producer).start();
        Thread.sleep(1000);
        new Thread(pc.consumer).start();
        Thread.sleep(1000);
        new Thread(pc.consumer).start();
        Thread.sleep(1000);
        new Thread(pc.consumer).start();*/
    }
}
