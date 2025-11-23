package coreJava.DSA.arrays;

public class ZeroShifting {
    public static void main(String[] args) {

        // move zero to right

        int[] arr = {1, 0, 2, 0, 3, 0};

        int index = 0; // position to put non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill remaining with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }

        // Print result
        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.println(" ");


        // move zero to left

        int[] arr1 = {1, 0, 2, 0, 3, 0};

        int index1 = arr1.length - 1; // position for non-zero elements from right

        for (int i = arr1.length - 1; i >= 0; i--) {
            if (arr1[i] != 0) {
                arr1[index1--] = arr1[i];
            }
        }

        // Fill remaining with zeros
        while (index1 >= 0) {
            arr1[index1--] = 0;
        }

        // Print result
        for (int n : arr1) {
            System.out.print(n + " ");
        }
    }
}