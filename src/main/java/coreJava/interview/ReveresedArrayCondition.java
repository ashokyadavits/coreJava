package coreJava.interview;

public class ReveresedArrayCondition {
    public static int[] reversedArray(int[] arr){
        int low = 0;
        int h1 = arr.length/2 -1;
        int low2 = arr.length/2+1;
        int h2 = arr.length-1;

        while (low<h1){
            int temp = arr[low];
            arr[low] = arr[h1];
            arr[h1] = temp;
            low++;
            h1--;
        }
        while (low2<h2){
            int temp = arr[low2];
            arr[low2] = arr[h2];
            arr[h2] = temp;
            low2++;
            h2--;
        }

        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,5,4,2,1};
        //3 2 1 5 1 2 4
        int[] ans =reversedArray(arr);
        for(int i:ans)
            System.out.print(i+" ");
    }
}
