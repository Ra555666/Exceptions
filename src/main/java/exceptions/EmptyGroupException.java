package exceptions;

public class EmptyGroupException extends Exception {
    public EmptyGroupException(){
        super("This group is empty!");
    }

    public EmptyGroupException(String eMessage){
        super(eMessage);
    }
}
