package coreJava.multithreading;

import java.util.concurrent.CompletableFuture;

public class ComputableFuture {
    public static void main(String[] args) {
        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {

                    try { Thread.sleep(1000); } catch (Exception e) {}
                    return "Data from async task";
                });

        System.out.println(future.join()); // wait and get value
    }
}