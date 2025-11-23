package coreJava.designPattern;

public class SingaltonDesign {

    private static SingaltonDesign instance;

    private SingaltonDesign() {
    }

    public static SingaltonDesign getInstance() {
        if (instance == null) {
            instance = new SingaltonDesign();
        }
        return instance;
    }
}