package coreJava.arrays;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private int id;
    private String name;
    private String dep;

    public Employee(int id, String name, String dep) {

    }

    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        Employee e = new Employee(1, "abc", "it");
        map.put(new Employee(1, "aman", "it"), "" +
                "Abc");
        map.put(new Employee(1, "aman", "it"), "bcd");
        System.out.println(map.get(new Employee(1, "aman", "it")));
    }
}