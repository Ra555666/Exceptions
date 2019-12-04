package exceptions;

public class TooFewSubjectsException extends Exception {

    public TooFewSubjectsException(){
        super("Too few subjects, add more!");
    }

    public TooFewSubjectsException(String eMessage){
        super(eMessage);
    }

}
