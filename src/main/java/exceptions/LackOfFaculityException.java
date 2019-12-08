package exceptions;

public class LackOfFaculityException extends Exception {

    public LackOfFaculityException(){
        super("Lack of faculty, try to find another!");
    }

    public LackOfFaculityException(String eMessage){
        super(eMessage);
    }
}
