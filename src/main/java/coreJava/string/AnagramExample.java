package coreJava.string;

import java.lang.reflect.Array;
import java.util.Arrays;

class StringProblems2 {

    public static void main(String[] args) {

        getString("abcd", "cdb");
        System.out.println("");

    }


    public static String getString(String ws, String s11){

        String st1 = "hllo";
        String st2 = "elloh";

        if(st1.length() == st2.length()){

            char[] s1 = st1.toCharArray();
            char[] s2 = st2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);
            if(Arrays.equals(s1, s2)){
                System.out.println("Anagrams");
            }
            else {
                System.out.println("not");
            }
        }
        else {
            System.out.println("not");
        }


        String s = "abcd";
        String s2 = "abcde";

        // count the string
        System.out.println(s.trim().length());
        System.out.println(s.toUpperCase().concat(s));

        return s.toUpperCase().concat(s);


    }
}