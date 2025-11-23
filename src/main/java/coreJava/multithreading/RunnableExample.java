package coreJava.multithreading;

public class RunnableExample {
    public static void main(String[] args) {

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task running using Runnable!");
            }
        };

        Thread t = new Thread(task);
        t.start();
    }
}