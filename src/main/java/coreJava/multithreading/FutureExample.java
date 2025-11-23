package coreJava.multithreading;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Task Result";
        };

        Future<String> future = executor.submit(task);

        System.out.println("Doing other work...");

        // get() waits for result
        String result = future.get();
        System.out.println("Result: " + result);

        executor.shutdown();
    }
}