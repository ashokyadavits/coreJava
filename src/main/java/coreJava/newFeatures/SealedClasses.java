package coreJava.newFeatures;

 sealed class Vehicle1 permits Car, Bike, Truck {
    public  void run(){

    }
}
 non-sealed class Bike extends Vehicle1 {
    @Override
    public void run() {
        System.out.println("Bike is running");
    }
}


 final class Car extends Vehicle1 {
    @Override
    public void run() {
        System.out.println("Car is running");
    }
}

 sealed class Truck extends Vehicle1 permits SmallTruck {
    @Override
    public void run() {
        System.out.println("Truck is running");
    }
}
 final class SmallTruck extends Truck {
    @Override
    public void run() {
        System.out.println("Small truck is running");
    }
}

 class Main {
    public static void main(String[] args) {
        Vehicle1 v1 = new Car();
        Vehicle1 v2 = new Bike();
        Vehicle1 v3 = new SmallTruck();

        v1.run();
        v2.run();
        v3.run();
    }
}