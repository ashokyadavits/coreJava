package coreJava;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ram", 100000, "IT"),
                new Employee(2, "Ravi", 20000, "Sales"),
                new Employee(3, "Rahul", 500000, "IT"),
                new Employee(4, "Ram", 450000, "Marketing"),
                new Employee(5, "Ranga", 30000, "Sales"));

        System.out.println("\nEmployees by department:");
        //TODO -Group Employees by department and print them using java8 streams

        Map <String, List<Employee>> result  = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(result);
        //TODO - Print employee name whose salary is greater than 40000 using java8 streams

        List<Employee> list = employees.stream().filter( n -> n.salary > 4000).collect(Collectors.toList());
        System.out.println(list);
        //TODO - Sort employees list by their name in descending order and print their names


        List<String> list1 = employees.stream().sorted(Comparator.comparing(Employee :: getName).reversed()).map(Employee::getName).toList();
        System.out.println(list1);
    }

    public static class Employee {
        private int id;
        private String name;
        private double salary;
        private String department;

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

        public double getSalary() {
            return salary;
        }

        public void setSalary(double sal) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Employee(int id, String name, double sal, String department) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", sal=" + salary +
                    ", department='" + department + '\'' +
                    '}';
        }
    }
}