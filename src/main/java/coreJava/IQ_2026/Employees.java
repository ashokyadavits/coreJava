package coreJava.IQ_2026;

import java.util.Arrays;
import java.util.List;

public class Employees {
    private String name;
    private String address;
    private String company;

    public Employees(String name, String address, String company) {
        this.name = name;
        this.address = address;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                '}';
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public static void main(String[] args) {

        List<Employees> employeesList = Arrays.asList(new Employees("man","delhi","it"),
                new Employees("ashok","mumbai","finance"));

       List<Employees> result = employeesList.stream().filter(n -> n.name.startsWith("a")).toList();
        System.out.println(result);
    }
}