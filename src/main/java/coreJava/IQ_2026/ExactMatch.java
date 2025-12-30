package coreJava.IQ_2026;

import java.util.Arrays;
import java.util.List;

public class ExactMatch {
    public static void main(String[] args) {
        List<String> deps = Arrays.asList("Dep1", "Dep2", "Dep3");
        String queryString = "QueryString.uri";

        boolean isPresent = deps.stream().anyMatch(dep -> dep.equals(queryString));
        System.out.println(isPresent);

    }
}