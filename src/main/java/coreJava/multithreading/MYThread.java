package coreJava.multithreading;

public class MYThread extends Thread {

    public void run(){

        for (int i = 0; i <10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Thread t = new MYThread();
        t.start();
    }


}
