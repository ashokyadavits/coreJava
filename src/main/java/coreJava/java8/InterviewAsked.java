package coreJava.java8;

import java.util.HashSet;
import java.util.Set;

public class InterviewAsked {


    // check isogram // no repeat character

    public static void main(String[] args) {
        boolean b = isogram("codec");
        System.out.println(b);

        //

        System.out.println(feb(10));
    }

    static  boolean isogram(String s){

         boolean isIsogram = true;
         char[] ch = s.toCharArray();
        Set<Character> chSet = new HashSet<>();

        for(Character c : ch){
            if(chSet.contains(c)){
                isIsogram = false;
            }
            else {
                isIsogram = true;
            }
        }
         return isIsogram;
    }

    // feb series


    static int feb(int i){

        if(i <=1){
            return i;
        }else
        return  feb(i-1) + feb(i-2);
    }
}