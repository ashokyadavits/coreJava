package coreJava.DSA.string;

public class CountVowel {
    public static void main(String[] args) {

        String str = "abcdef";
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println(count);

        // using java8

        Long count1 = str.chars().mapToObj(c -> (char) c).filter(ch -> "aeiouAEIOU".indexOf(ch) != -1).count();
        System.out.println(count1);


    }
}