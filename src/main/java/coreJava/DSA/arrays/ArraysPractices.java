package coreJava.DSA.arrays;

import java.util.Arrays;

public class ArraysPractices {
    public static void main(String[] args) {

        // two d array\

        int [][] arr = new int[2][2];
        arr [1][1] = 20;
        arr[0][0] = 50;

        // print the array

        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }


    }
}