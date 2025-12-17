package coreJava.DSA.arrays;

import java.util.Arrays;
import java.util.List;

public class SquareRoot {
    public static void main(String[] args) {
        int [] arr = {8, 27};
        double[] result = Arrays.stream(arr).mapToDouble(Math :: sqrt).toArray();
        double result1 = Arrays.stream(arr).mapToDouble(Math :: sqrt).sum();
        System.out.println(Arrays.toString(result));
        System.out.println(result1);

    }
}