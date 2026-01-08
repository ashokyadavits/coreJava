package coreJava.basicPrograms;

import java.util.Arrays;

public class ZeroShifting {

    public static void main(String[] args) {
        int [] ar = {0,2,0,9,0,1};
        int index = 0;

        for(int num : ar){
            if(num !=0){
                ar[index++] = num;
            }
        }
        while (index < ar.length){
            ar[index++] =0;
        }
        System.out.println(Arrays.toString(ar));
    }
}