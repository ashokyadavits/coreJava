package coreJava.DSA;

import java.util.Arrays;

public class KaprekarConstant {
    public static void main(String[] args) {

        //Take any 4-digit number (at least two different digits)
        //Arrange digits in descending order
        //Arrange digits in ascending order
        //Subtract smaller from larger
        //Repeat until result becomes 6174

        // simplest way

        int num = 1545;
        int count = 0;
        while (num != 6174){
            int asc = reverse(num)[0];
            int desc = reverse(num)[1];

            num = desc-asc;
            count++;

        }
        System.out.println(count);
    }

    public static int[] reverse(int i){
        char [] ch  = String.valueOf(i).toCharArray();
        Arrays.sort(ch);

        int [] ar = new int[2];

        ar[0] = Integer.parseInt(new String(ch));
        ar[1] = Integer.parseInt(new StringBuilder(new String(ch)).reverse().toString());

        return ar;
    }
}