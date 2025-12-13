package coreJava.DSA.string;

public class StringDemo {
    public static void main(String[] args) {
        String str1 ="Hello";
        String str2 = "Hello";

        String str3 = new String(str1);
        System.out.println( str1 == str3);
        System.out.println(str1.equals(str3));


    }
}