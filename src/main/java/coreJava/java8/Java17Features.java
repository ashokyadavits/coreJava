package coreJava.java8;

public class Java17Features {

    // record classes
    // sealed classes

}

sealed class Vehicle permits Bus {


}

final class Bus extends Vehicle {

}

class Taxi {

}