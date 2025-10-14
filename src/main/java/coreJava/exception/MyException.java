package coreJava.exception;

public class MyException extends Exception {

    MyException(String myExc){
        super(myExc);
    }

    public static void main(String[] args) {
        try {
            throw  new MyException("my exception");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }


    }


}
