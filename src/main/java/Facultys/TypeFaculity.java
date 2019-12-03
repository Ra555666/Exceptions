package Facultys;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public enum TypeFaculity {
    CHEMICAL("Chemical"),
    BIOLOGY("Biological"),
    PHYSICAL("Physics");

    private String title;

    TypeFaculity(String title){
        this.title = title;
    }

    public String getFacultyTitle(){
        return title;
    }

}
