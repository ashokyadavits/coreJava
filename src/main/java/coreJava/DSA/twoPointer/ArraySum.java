package coreJava.DSA.twoPointer;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 20, 10};
        int target = 17;
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println(true);
                i++;
                j--;
                continue;
            }
            if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        String str = "abcdfe";
        System.out.println(str.substring(1, str.length() - 1) + str.charAt(0));

    }
}