package coreJava.DSA.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] ar = {1, 2, 3, 4, 5};
        Arrays.sort(ar, Collections.reverseOrder());
        System.out.println(Arrays.toString(ar));
    }
}