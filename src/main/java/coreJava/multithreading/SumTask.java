package coreJava.multithreading;

import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {
    int start, end;

    SumTask(int s, int e) {
        start = s;
        end = e;
    }

    protected Integer compute() {
        if (end - start <= 10) {
            int sum = 0;
            for (int i = start; i <= end; i++) sum += i;
            return sum;
        }
        int mid = (start + end) / 2;
        SumTask left = new SumTask(start, mid);
        SumTask right = new SumTask(mid + 1, end);
        left.fork();
        return right.compute() + left.join();
    }
}

 class ForkDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
       // int result = new SumTask(1, 1000);
       // System.out.println(result);
    }
}