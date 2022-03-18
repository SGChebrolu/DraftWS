package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BuiltInExecutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) {
            service.execute(() -> {
                System.out.println("Hello from " + Thread.currentThread().getName());
            });
        }
    }
}
