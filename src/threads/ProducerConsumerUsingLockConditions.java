package threads;

public class ProducerConsumerUsingLockConditions {
    private CustomBQ blockingQueue;

    public ProducerConsumerUsingLockConditions(CustomBQ blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    Runnable producer = () -> {
        //while (true){
        System.out.println("Producer "+Thread.currentThread().getName()+" Adding item to Q ");
        blockingQueue.put(createItem());
        //}
    };

    final Runnable consumer = () -> {
        //while (true){
        System.out.println("Consumer "+Thread.currentThread().getName()+" Pulling item from Q ");
        Double item = (Double) blockingQueue.take();
        System.out.println("Consumer "+Thread.currentThread().getName()+"  Pulling item from Q :: " + item);
        //}
    };

    private static double createItem() {
        return Math.random();
    }

    public static void main(String[] args) throws InterruptedException {


        ProducerConsumerUsingLockConditions pc = new ProducerConsumerUsingLockConditions(new CustomBQ(1));

        new Thread(pc.consumer,"C1").start();
        Thread.sleep(1000);
        new Thread(pc.consumer,"C2").start();
        Thread.sleep(1000);
        new Thread(pc.producer,"P1").start();
        Thread.sleep(1000);
        new Thread(pc.consumer,"C3").start();
        Thread.sleep(1000);
    }

}
