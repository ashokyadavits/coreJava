package coreJava.multithreading;
import java.util.concurrent.*;

public class ExecuterExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Callable<Integer> task = () -> {
            System.out.println("Calcuate sum " + Thread.currentThread().getName());
            return 10 + 20;
        };
        Future<Integer> future = executorService.submit(task);
        System.out.println("Main thread is working ");

        Integer result = future.get();
        System.out.println("Result " + result);
        executorService.shutdown();
    }
}
