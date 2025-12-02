package coreJava.java8.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BinarySearch {
    public static void main(String[] args) {

        int [] ar = {1,2,3,4,5};
        int key = 3;
        boolean indesx = Arrays.stream(ar).anyMatch(n -> n == key);
        System.out.println(indesx);

        // find the index
        int index = Arrays.stream(ar).boxed().collect(Collectors.toList()).indexOf(key);
        System.out.println(index);

        // normal method

        for(int i = 0 ; i < ar.length-1; i++){
            if(ar[i] == key){
                System.out.println(ar[i]);
            }
        }

    }
}