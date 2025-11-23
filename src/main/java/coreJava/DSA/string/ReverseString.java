package coreJava.DSA.string;
public class ReverseString {
    public static void main(String[] args) {
        String str = "abcd";
        StringBuilder sb = new StringBuilder(new StringBuilder(str).reverse().toString());
        System.out.println(sb);

        // using for loop
        String rev = "";
        for(int i= 0; i < str.length(); i++){
            rev = rev+ sb.charAt(i);
        }
        System.out.println(rev);

        //
    }
}