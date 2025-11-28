package coreJava.designPattern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {

    public static void main(String[] args) {
        Employee1 emp = new Employee1(101, "Ashok");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {

            oos.writeObject(emp);
            System.out.println("Object serialized successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

 class Employee1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}