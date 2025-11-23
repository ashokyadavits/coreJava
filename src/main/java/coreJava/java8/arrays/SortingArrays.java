package coreJava.java8.arrays;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.apache.logging.log4j.util.PropertySource;
import org.springframework.util.comparator.Comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortingArrays {

    public static void main(String[] args) {
        int [] ar ={1,2,13,3,1,2,3};

        int [] sorted = Arrays.stream(ar).sorted().toArray();
        System.out.println(Arrays.toString(sorted));

        // desc order

        Object[] revOrder = Arrays.stream(ar).boxed().sorted(Collections.reverseOrder()).toArray();
        System.out.println(Arrays.toString(revOrder));

    }
}