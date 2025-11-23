package coreJava;

import java.util.Arrays;

public class SecondMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 30};

        int secondMax = Arrays.stream(arr).distinct().boxed().sorted((a, b) -> b - a).skip(1)
                .findFirst().orElseThrow();
        System.out.println("Second Max: " + secondMax);


        // sort and then find

        int[] arr1 = {10, 50, 20, 40, 30};

        Arrays.sort(arr1);  // ascending sort
        int secondMax1 = arr1[arr1.length - 2];
        System.out.println("Second Max: " + secondMax);
    }
}