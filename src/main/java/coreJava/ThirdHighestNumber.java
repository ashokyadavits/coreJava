package coreJava;

import java.util.Arrays;

public class ThirdHighestNumber {

    public static void main(String[] args) {

        int [] arr = {12,23,34,35,44};
        Arrays.sort(arr);  // ascending

        int n = arr.length;
        int count = 1;
        int third = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[i + 1]) {   // unique numbers
                count++;
            }
            if (count == 3) {
                third = arr[i];
                break;
            }
        }

        System.out.println("3rd Highest: " + third);
    }
}