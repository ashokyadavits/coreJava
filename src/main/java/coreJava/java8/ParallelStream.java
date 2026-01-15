package coreJava.java8;

import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        String str = "parallelStream";

        List<Character> result = str.chars().parallel().mapToObj(c -> (char) c).toList();
        System.out.println(result + " Thread Name - " + Thread.currentThread().getName());
    }
}