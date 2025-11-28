package coreJava.newFeatures;

public class PatterMatching {
    public static void main(String[] args) {
        Object obj = "abc";
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.length());
        }

    }
}