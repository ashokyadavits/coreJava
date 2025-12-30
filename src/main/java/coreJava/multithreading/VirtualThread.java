package coreJava.multithreading;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThread {

    public static void main(String[] args) throws Exception {

        // 1️⃣ Create Virtual Thread Executor
        ExecutorService executor =
                Executors.newSingleThreadExecutor();

        // 2️⃣ Simulate 10,000 concurrent requests
        for (int i = 1; i <= 10_000; i++) {
            int requestId = i;

            executor.submit(() -> handleRequest(requestId));
        }

        // 3️⃣ Graceful shutdown
        //executor.close();
    }

    // Simulates a blocking request handler
    private static void handleRequest(int requestId) {
        try {
            System.out.println(
                    "Request " + requestId +
                            " handled by " + Thread.currentThread() +
                            " at " + LocalTime.now()
            );

            // Blocking operation (cheap in virtual threads)
            Thread.sleep(1000);

            System.out.println(
                    "Request " + requestId +
                            " completed by " + Thread.currentThread()
            );

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}