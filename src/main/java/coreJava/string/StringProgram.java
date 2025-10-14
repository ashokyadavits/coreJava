package coreJava.string;

import java.util.Arrays;
import java.util.List;

public class StringProgram {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.substring(1, 2));

        List<String> strList = Arrays.asList(s);
        System.out.println(strList);

        for(int i =0; i< strList.size(); i++){
            System.out.println(i);
        }


        // reverser a string --

        String st = new String("abcd");
        String rev ="";
        for(int i = st.length()-1; i >=0 ; i--){
            rev = rev + st.charAt(i);
            System.out.print(rev);
        }


    }

}
