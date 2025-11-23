package coreJava.DSA.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
 class Demo16 {

    public static void main(String[] args) {

        int [] ar = {1,7,3,2,6,5};

        for(int i = 0 ; i < ar.length; i ++){

            int leftSum = 0;
            int rightSum = 0;

            for(int j = 0; j < i ; j++) {
                leftSum += ar[j];
            }
                for (int j = i + 1; j < ar.length; j++) {
                    rightSum += ar[j];
                    //
                }

                if (leftSum == rightSum) {
                    System.out.println("index number is : " +i);
                }
            }

        // using java8

        int index = IntStream.range(0, ar.length)  // iterate over indices
                .filter(i ->                     // filter only those indices where condition is true
                        IntStream.range(0, i).map(j -> ar[j]).sum() ==
                                IntStream.range(i + 1, ar.length).map(j -> ar[j]).sum()
                )
                .findFirst()                     // take the first matching index
                .orElse(-1);                     // if none found, return -1

        System.out.println("Index where left and right sum are equal: " + index);

        }
    }