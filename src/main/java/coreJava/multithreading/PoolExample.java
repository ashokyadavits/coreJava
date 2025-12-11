package coreJava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PoolExample {
        public static void main(String[] args) throws InterruptedException {
            ExecutorService pool = Executors.newFixedThreadPool(3);
            for (int i=1;i<=5;i++){
                int id=i;
                pool.submit(() -> {
                    System.out.println("Task " + id + " in " + Thread.currentThread().getName());
                });
            }
            pool.shutdown();
            pool.awaitTermination(5, TimeUnit.SECONDS);
        }
    }