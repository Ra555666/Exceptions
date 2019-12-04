package exceptions;

public class NonAvailabilityStudentException extends Exception {

    public NonAvailabilityStudentException(){
        super("This Student is not exist!");
    }

    public NonAvailabilityStudentException(String eMessage){
        super(eMessage);
    }
}
