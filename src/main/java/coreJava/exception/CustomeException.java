package coreJava.exception;

public class CustomeException extends Exception  {

    CustomeException(String msg){
        super((msg));
    }

    public static void main(String[] args) {
        try{

            throw new CustomeException(" Custom error");

        }catch (CustomeException e){
            System.out.println(e.getMessage());
        }
    }
}
