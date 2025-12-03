package coreJava.DSA.character;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SmallestWord {
    public static void main(String[] args) {
        String str = "java is smallest";

        List<String> list = Arrays.asList(str.split(" "));

        String result = list.stream().map(String :: toString).sorted().findFirst().orElseThrow();
        System.out.println(result);

        // largest word

        String result1 = list.stream().map(String::toString).sorted(Comparator.reverseOrder()).findFirst().orElseThrow();
        System.out.println(result1);


    }
}