package coreJava.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () -> {
            Thread.sleep(300);
            return 42;
        };
        Future<Integer> f = ex.submit(task);
        System.out.println("Result: " + f.get()); // blocks
        ex.shutdown();
    }
}