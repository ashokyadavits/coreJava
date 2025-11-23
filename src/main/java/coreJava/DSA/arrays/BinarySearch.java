package coreJava.DSA.arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {10, 34, 45, 67, 88, 90};
        int key = 67;
        int outputIndex = search(arr, key);
        System.out.println(outputIndex);

    }
    public static int search(int[] arr, int key) {

        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}