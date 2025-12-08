package coreJava.DSA.arrays;

public class LargestDigit {
    public static void main(String[] args) {
        int num = 23445;

        //String.valueOf(num).chars() → gets each character
        //.map(c -> c - '0') → convert char to digit
        int max = String.valueOf(num).chars().map(c -> c -'0').max().getAsInt();
        System.out.println(max);
    }
}