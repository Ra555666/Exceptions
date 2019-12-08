package exceptions;

public class WrongGradeException extends Exception {

    public WrongGradeException(){
        super("Invalid grade, something wrong!");
    }

    public WrongGradeException(String eMessage){
        super(eMessage);
    }
}
