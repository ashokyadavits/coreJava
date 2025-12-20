package coreJava.DSA.string;

import java.util.Arrays;

public class TwoDString {
    public static void main(String[] args) {

        String [][] str = new String[2][4];

        str[0][1] = "Amit";
        str[1][2] = "Ama";

        for(String [] row : str){
            System.out.println(Arrays.toString(row));
        }
    }
}