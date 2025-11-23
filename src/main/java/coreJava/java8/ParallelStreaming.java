package coreJava.java8;

import java.util.Arrays;
import java.util.List;

public class ParallelStreaming {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.parallelStream().forEach(n -> System.out.println(Thread.currentThread().getName() + " → " + n));
    }
}