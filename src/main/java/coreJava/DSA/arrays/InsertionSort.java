package coreJava.DSA.arrays;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10, 30};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];       // Element to be inserted
            int j = i - 1;          // Start checking from previous index

            // Shift elements if they are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at correct position
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));

    }
}