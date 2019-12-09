import facultys.GroupOfStudents;
import facultys.TypeFaculity;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        University testUniversity = new University(ListOfStudents.getAllStudent());
        System.out.println(ListOfStudents.getAllStudent().toString());

        testUniversity.averageStudentGradeCalculator(testUniversity.getStudentFromListOfStudents());

        testUniversity.averageGradeBySubjectOfGroupAndFaculty();

        testUniversity.averageGradeOfSubjectByAllUniversity();

        System.out.println(testUniversity.getListStudentsOfEasyGroup());
    }
}
