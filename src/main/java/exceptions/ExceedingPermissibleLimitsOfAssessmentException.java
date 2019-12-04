package exceptions;

public class ExceedingPermissibleLimitsOfAssessmentException extends Exception {

    public ExceedingPermissibleLimitsOfAssessmentException(){
        super("Invalid grade, something wrong!");
    }

    public ExceedingPermissibleLimitsOfAssessmentException(String eMessage){
        super(eMessage);
    }
}
