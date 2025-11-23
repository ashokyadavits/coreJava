package coreJava.DSA.arrays;

import java.util.Arrays;

public class MaxArray {

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 80, 20};

        int max = Integer.MIN_VALUE;
        for (int num : arr) {

            if (num > max) {
                max = num;
            }

        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(max);

        // using java8

        int maxx = Arrays.stream(arr).max().getAsInt();
        System.out.println(maxx);

    }
}