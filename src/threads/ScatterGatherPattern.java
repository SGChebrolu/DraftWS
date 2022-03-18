package threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ScatterGatherPattern {
    Runnable web1= () -> {
        //callWebsite1()
    };

    Runnable web2= () -> {
        //callWebsite2()
    };

    Callable web3= () -> {
        //callWebsite3()
        return 100;
    };

    public static void main(String[] args){
        ScatterGatherPattern scatterGatherPattern = new ScatterGatherPattern();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Integer> future1 = executorService.submit(new Task("url1","productId"));
        Future<Integer> future2 = executorService.submit(new Task("url2","productId"));
        Future<Integer> future3 = executorService.submit(new Task("url3","productId"));

        //executorService.get


    }

    static class Task implements Callable<Integer> {

        public Task(String url, String productId) {

        }

        @Override
        public Integer call() throws Exception {
            //Make actual http call and return response
            return new Random().nextInt();
        }
    }
}
