package coreJava.java8.Char;

import java.util.Arrays;

public class LongestRepeateatingChar {
    public static void main(String[] args) {
        String str = "ababcaaa";

        char [] ch = str.toCharArray();
        char maxChar = ch[0];
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < ch.length; i++){

            if(ch[i] == ch[i-1]){
                currentLength++;
            }
            else {
                currentLength =1;
            }
            if(currentLength > maxLength){
                maxLength = currentLength;
                maxChar = ch[i];
            }
        }
        System.out.println(Arrays.toString(ch));

    }
}