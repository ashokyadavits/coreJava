package coreJava.oops;

public class Vehical {

    public static void main(String[] args) {

        Vehical v = new Vehical();
        System.out.println(v.run());
        System.out.println(Vehical.fast());
    }
    public String run(){
        return "running";
    }
    public static String fast(){
        return "running fast";
    }
}
