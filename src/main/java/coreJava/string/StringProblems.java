package coreJava.string;

import java.util.Scanner;

public class StringProblems {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter charatcer");
        String str = sc.next();
       // String str = "ABCD";
        String rev = "";

        // reverse a string

        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        System.out.println(str.length());


        if(str.equals(rev)){
            System.out.println("palindrom");

        }else {
            System.out.println("not ");
        }

        String st = new String("abcd");
        String st1 = "ABCDE";
        System.out.println(st == st1);
        System.out.println(st.equals(st1));
        System.out.println(st.concat(st1));
        System.out.println(st.charAt(2));

        int com = st.length();
        int com1 = st1.length();
        if(com > com1){
            System.out.println("com is greater, length is  = " + com);
            System.out.println("");

        }else {
            System.out.println("Com1 is greater " +com1);
        }


        // Check Anagrams — Are two strings anagrams?




    }
}
