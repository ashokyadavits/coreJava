package coreJava.string;

import java.util.Arrays;
import java.util.List;

public class StringPrograms {
    public static void main(String[] args) {
       String str = "abcd";
       String rev = "";
       for(int i = str.length() -1; i >=0; i--){
           rev = rev + str.charAt(i);
       }
       System.out.println(rev);

       String reverse = new StringBuilder(str).reverse().toString();
       System.out.println(reverse);

        List<String> s = Arrays.asList(str);
        System.out.println(s);
        for(int i = 0 ; i <=s.size(); i++)
        System.out.print(i);

    }
}
