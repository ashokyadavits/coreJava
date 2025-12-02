package coreJava.java8.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MaxArray {
    public static void main(String[] args) {

        int [] ar = {12,4,1,11,122,333};
        int result = Arrays.stream(ar).boxed().sorted(Comparator.reverseOrder()).findFirst().orElseThrow();
        System.out.println(result);

        int max = Arrays.stream(ar).max().orElseThrow();
        System.out.println(max);

        int min = Arrays.stream(ar).min().orElseThrow();
        System.out.println(min);

    }
}