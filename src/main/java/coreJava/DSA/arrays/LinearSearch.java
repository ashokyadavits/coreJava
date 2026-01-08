package coreJava.DSA.arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {10, 40, 30, 80, 20};
        int target = 30;

        int index = linearSearch(arr, target);
        if (index != -1)
            System.out.println("Found at index: " + index);
        else
            System.out.println("Not found");
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // return index
            }
        }
        return -1;  // not found
    }
}