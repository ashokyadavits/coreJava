package coreJava.DSA.character;

public class LongestRepeatingChar {
    public static void main(String[] args) {

        String s = "aaaaaabcd";
        int maxLen = 1;
        int currLen = 1;
        char maxChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            // If same as previous char → increase count
            if (s.charAt(i) == s.charAt(i - 1)) {
                currLen++;
            } else {
                currLen = 1; // reset for new character
            }

            // Update max length
            if (currLen > maxLen) {
                maxLen = currLen;
                maxChar = s.charAt(i);
            }

        }
        System.out.println(maxChar);
        System.out.println(maxLen);
    }
}