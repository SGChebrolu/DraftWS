package threads;

public class ThreadCreationExtend extends Thread{

    public void run(){
        System.out.println("Hello from Thread Run");
    }

    public static void main(String[] args){
        System.out.println("Hello from Main");
        ThreadCreationExtend t1 = new ThreadCreationExtend();
        t1.start();



    }

}
