package coreJava.DSA.DSA_PROGRAMS;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {

        int [] arr ={0,1,0,5,0};
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));

        // move to start

        int index1 = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index1--] = arr[i];
            }
        }

        while (index1 >= 0) {
            arr[index1--] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}