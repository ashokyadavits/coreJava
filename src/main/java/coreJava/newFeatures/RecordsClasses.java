package coreJava.newFeatures;
public class RecordsClasses {
    public static void main(String[] args) {

        Employee employee = new Employee("amit", 1);
        System.out.println(employee);
    }
}
 record Employee(String name, int id) {

 }