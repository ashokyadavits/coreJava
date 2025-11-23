package coreJava.DSA.DSA_PROGRAMS;

import java.util.Arrays;

public class AnagramProgram {
    public static void main(String[] args) {

        // if their sorted version are equal

        String str1 = "listen";
        String str2 = "silent";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("NOT Anagram");
        }

    }
}