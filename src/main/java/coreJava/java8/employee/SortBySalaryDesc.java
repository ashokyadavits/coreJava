package coreJava.java8.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortBySalaryDesc {
    public static void main(String[] args) {
        List<EmployeeDetail> employees = Arrays.asList(
                new EmployeeDetail(1, "Ashok", 30000),
                new EmployeeDetail(2, "Vikram", 72000),
                new EmployeeDetail(3, "Ravi", 48000),
                new EmployeeDetail(4, "Neha", 65000)
        );

        // Sort by salary in descending order
        List<EmployeeDetail> sortedList = employees.stream()
                .sorted(Comparator.comparingDouble(EmployeeDetail::getSalary).reversed())
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}

class EmployeeDetail{

    int id;
    String name;
    double salary;

    public EmployeeDetail(int id, String name, double salary) {
        this.id = id;
        this.name = name;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}