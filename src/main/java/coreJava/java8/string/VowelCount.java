package coreJava.java8.string;

public class VowelCount {
    public static void main(String[] args) {
        String str = "programming";

        long countVowel = str.chars().mapToObj(c -> (char) c).filter( n -> "aeiouAEIOU".indexOf(n) != -1).count();
        System.out.println(countVowel);
    }
}