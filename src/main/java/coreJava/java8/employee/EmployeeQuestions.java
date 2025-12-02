package coreJava.java8.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeQuestions {
    public static void main(String[] args) {

        List<EmployeeExample1> emp = Arrays.asList(new EmployeeExample1(11, "amit", "Deoria", 1000),
                new EmployeeExample1(12, "amit1", "Deoria", 2000),
                new EmployeeExample1(13, "amit2", "Deoria", 3000)
        );

        List<String> empName = emp.stream().map(EmployeeExample1 ::getName).collect(Collectors.toList());
        System.out.println(empName);
    }
}

class EmployeeExample1 {

    int id;
    String name;
    String address;
    float salary;

    public EmployeeExample1(int id, String name, String address, float salary) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}