package coreJava.DSA.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 80};
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

        // using java8

        int[] arr1 = {10, 50, 30, 80};

        Arrays.sort(arr1);
        int[] reversed = Arrays.stream(arr1)
                .boxed()
                .sorted(Collections.reverseOrder())   // but sorts in reverse, not reverse array order
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(reversed));

        // USING FOR LOOP

        int[] arr3 = {10, 50, 30, 80};

        for ( i = 0; i < arr3.length / 2; i++) {
            int temp = arr3[i];
            arr3[i] = arr3[arr3.length - 1 - i];
            arr3[arr3.length - 1 - i] = temp;
        }

        // Print only once after full reverse
        System.out.println(Arrays.toString(arr3));


    }
}