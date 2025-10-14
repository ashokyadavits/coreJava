package coreJava.java8;

import java.util.*;
import java.util.stream.Collectors;


public class Employee {
    
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
         new Employee(1, "abc", "it", 5000),
         new Employee(2,"raj", "hr", 6000),
         new Employee(3, "raju", "it", 7000)

        );

      Map<Double, List<Employee>> result =  empList.stream().collect(Collectors.groupingBy((Employee :: getSalary)));

        System.out.println(result);

        // employee count

        Long result2 = empList.stream().collect(Collectors.counting());
        System.out.println(result2);

        // group employee by dept

        Map<String,List<Employee>> result3 = empList.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(result3);

        // find the highest paid emp

        Optional<Employee> result4 = empList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(result4);


        // lowest paid emp

        Optional<Employee> result5 = empList.stream().min(Comparator.comparingDouble(Employee ::getSalary));
        System.out.println(result5);


        // cont the employee in each dept

        Map<String, Long> map = empList.stream().collect(Collectors.groupingBy(Employee:: getDept, Collectors.counting()));
        System.out.println(map);

        // average Salary

        Map<String,Double> resultAverage = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(resultAverage);

        // name od all employee in a list

        List<String> name = empList.stream().map(Employee::getName).toList();
        System.out.println(name);

        // get salary

        List<Double> salary = empList.stream().map(Employee::getSalary).toList();
        System.out.println(salary);

        // second highest salary

        Optional<Double> secondHighest = empList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHighest);

        //
        List<Double> resultdec = empList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).toList();

        System.out.println(resultdec);


        // dept with higest salary

     String st = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.summingDouble(Employee::getSalary)))
             .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry ::getKey).orElse("No dept");

        System.out.println(st);




    }
}
