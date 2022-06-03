package threads;

public class ThreadCreationRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from Thread Run");
    }

    public static void main(String[] args){
        ThreadCreationRunnable t1 =new ThreadCreationRunnable();
        t1.run();

        ThreadCreationRunnable t2 = new ThreadCreationRunnable();
        Thread t3 = new Thread(t2); //using Thread Constructor which accepts Runnable as an Argument
        t3.start();
    }
}
