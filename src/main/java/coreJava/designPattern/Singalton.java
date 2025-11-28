package coreJava.designPattern;

public class Singalton {

    private static Singalton instance;
    private Singalton(){

        instance = new Singalton();
    }

    public static Singalton getInstance(){

        return instance;
    }
}