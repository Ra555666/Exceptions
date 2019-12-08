package exceptions;

public class LackOfGroupsOnFacultyException extends Exception {
    public LackOfGroupsOnFacultyException(){
        super("There are no groups at the faculty!");
    }

    public LackOfGroupsOnFacultyException(String eMessage){
        super(eMessage);
    }
}
