package coreJava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Demo11 {

    public static void main(String[] args) {

        // student table - id, name , marks, subjectId, status
        // subject table - id

        List<Student> studentList = Arrays.asList(new Student(11,"jaman", "300", "12","passed"),

        new Student(12,"aaj", "500", "13","failed"),
                new Student(13,"ram", "600", "14","passed")
        );

       List<String> result = studentList.stream().map(Student::getName).toList();

       List<String> result1 = studentList.stream().map(Student::getName).sorted().toList();
        System.out.println(result1);

        Map<String, Long> map = studentList.stream().collect(Collectors.groupingBy(Student::getStatus, Collectors.counting()));

        System.out.println(result);
        System.out.println(map);
    }
}

class Student{


    int id;
    String name;
    String  marks;
    String subjectId;
    String status;

    public Student(int id, String name, String marks, String subjectId, String status) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.subjectId = subjectId;
        this.status = status;
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

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks='" + marks + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}