package coreJava.java8.string;

import java.util.Arrays;
import java.util.List;

public class StringExamples {

    public static void main(String[] args) {

        String input = "amitYadav";

        // conert string to stream of char
       //input.chars().forEach( ch -> System.out.print((char) ch + " "));


        // count the char
       long count = input.chars().count();
        System.out.println(count);

        // count the a

        long count1 = input.chars().filter(ch -> ch=='a').count();
        System.out.println(count1);


    }
}