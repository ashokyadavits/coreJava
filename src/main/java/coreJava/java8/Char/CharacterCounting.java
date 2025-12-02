package coreJava.java8.Char;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.spel.spi.Function;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCounting {
    public static void main(String[] args) {

        String str = "ababab";
        List<String> list = Arrays.asList(str.split(""));
        System.out.println(list);

        Map<Object, Long> result = list.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()));
        System.out.println(result);

        // zero shifting

        int [] ar = {1,0,2,0,4,0};
        int index = 0;
        for(int num : ar){
            if(num !=0){
                ar[index++] = num;
            }
        }
        while (index < ar.length){
            ar[index++] = 0;
        }
        System.out.println(Arrays.toString(ar));


    }
}