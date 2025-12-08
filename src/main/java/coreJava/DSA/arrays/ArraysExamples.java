package coreJava.DSA.arrays;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;

        int[] arr1 = {10, 20, 30};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //

        int max = Arrays.stream(arr1).max().orElseThrow();
        System.out.println(max);

    }
}