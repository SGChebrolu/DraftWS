package threads;

import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ExecutorServiceUsage {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 1
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("availableProcessors :"+availableProcessors);

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(availableProcessors);

        for (int i = 0; i < 20; i++) {
            fixedThreadPool.execute(() -> {
                System.out.println("Hello from " + Thread.currentThread().getName());
            });
        }

        //2
        ExecutorService cachedTP = Executors.newCachedThreadPool();

        for (int i = 0; i < 20; i++) {
            cachedTP.execute(() -> {
                System.out.println("Hello from " + Thread.currentThread().getName());
            });
        }

        //3
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        Runnable runnable = () -> System.out.println("Hello from " + Thread.currentThread().getName());

        scheduledExecutorService.schedule(runnable, 10,SECONDS);

        //4
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //5 - ToDo - Advanced usage with Constructor methods

        //6 - Callable

        Callable callable = () -> "Hello from " + Thread.currentThread().getName();

        Future<Integer> future = fixedThreadPool.submit(callable);
        System.out.println(future.get());

        //7

        CompletableFuture.supplyAsync(()->"Hello from Top") //Accepts a Supplier
                .thenAcceptAsync((x)->{});

        CompletableFuture completableFuture = new CompletableFuture();
        //completableFuture.
    }


}
