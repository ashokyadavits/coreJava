package coreJava.DSA;

import java.util.Arrays;

 class ElementsShifting {

    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 2, 2, 3, 0, 4, 0};
        // shift all the  zero elements to left
        int[] newArray = new int[arr.length];
        int zeroCount = 0;

        // count zero
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }

        //fill zero first

        for (int i = 0; i < zeroCount; i++) {
            newArray[i] = 0;
        }
        // fill remaining elements

        for (int rem : arr) {
            if (rem != 0) {
                newArray[zeroCount++] = rem;
            }
        }

        System.out.println(Arrays.toString(newArray));

        // second method - two pointer approach







        // shift zero element to right


    }
}