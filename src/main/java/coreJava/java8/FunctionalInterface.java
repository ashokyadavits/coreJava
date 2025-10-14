package java8;

public class FunctionalInterface {

    interface AddOperation{

        int addOper(int a, int b);

    }

    public static void main(String[] args) {

        AddOperation ad = (a, b) -> a+b;

        System.out.println(ad.addOper(10,20));
    }

}
