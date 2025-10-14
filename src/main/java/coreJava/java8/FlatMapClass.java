package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapClass {

    public static void main(String[] args) {
            List<String> sentences = Arrays.asList(
                    "Java is powerful",
                    "Streams are powerful and flexible",
                    "Java streams simplify data processing"
            );

            List<String> uniqueWords = sentences.stream()
                    .map(sentence -> sentence.split(" "))      // Stream<String[]>
                    .flatMap(Arrays::stream)                   // Stream<String>
                    .map(String::toLowerCase)                  // Optional: normalize casing
                    .distinct()                                // Remove duplicates
                    .collect(Collectors.toList());             // Collect to list
            System.out.println(uniqueWords);
        }
    }

