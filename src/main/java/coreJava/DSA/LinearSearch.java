package coreJava.DSA;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5,6};

        int key = 6;

        for(int i = 0; i <=ar.length-1; i++){
            if(ar[i] == key){
                System.out.println("Found the element " + ar[i]);
            }
        }
    }
}