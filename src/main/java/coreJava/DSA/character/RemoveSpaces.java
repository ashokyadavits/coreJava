package coreJava.DSA.character;
import java.util.stream.Collectors;

public class RemoveSpaces {

    public static void main(String[] args) {
        String str = "java is best";

        String result = str.chars().filter(n -> !Character.isWhitespace(n)).mapToObj(n -> String.
                valueOf((char) n)).collect(Collectors.joining());
        System.out.println(result);
    }
}