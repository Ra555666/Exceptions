import Facultys.GroupOfStudents;
import Facultys.TypeFaculity;

import java.util.Arrays;
import java.util.List;

public class Main {
    static List<Student> allStudent = Arrays.asList(
            new Student("John","Smith", TypeFaculity.PHYSICAL, GroupOfStudents.EASY),
            new Student("Martin","Goose", TypeFaculity.PHYSICAL, GroupOfStudents.NORMAL),
            new Student("Paul", "Pig", TypeFaculity.PHYSICAL,GroupOfStudents.EASY),
            new Student("Antony", "Bee", TypeFaculity.PHYSICAL, GroupOfStudents.NORMAL),
            new Student("Mathew", "Parry", TypeFaculity.PHYSICAL,GroupOfStudents.EASY),
            new Student("Marc", "Mars", TypeFaculity.BIOLOGY,GroupOfStudents.HARD),
            new Student("John","Doe", TypeFaculity.BIOLOGY,GroupOfStudents.EASY),
            new Student("Calvin", "Crane", TypeFaculity.BIOLOGY,GroupOfStudents.HARD),
            new Student("Timothy", "Gunn", TypeFaculity.BIOLOGY,GroupOfStudents.EASY),
            new Student("Ray", "Whore", TypeFaculity.BIOLOGY,GroupOfStudents.NORMAL),
            new Student("Josh", "Jew", TypeFaculity.CHEMICAL,GroupOfStudents.NORMAL),
            new Student("Nick", "Stone", TypeFaculity.CHEMICAL,GroupOfStudents.HARD),
            new Student("Daris", "Heris", TypeFaculity.CHEMICAL,GroupOfStudents.EASY),
            new Student("Phill", "Mouth", TypeFaculity.CHEMICAL,GroupOfStudents.NORMAL),
            new Student("Father", "Mather", TypeFaculity.CHEMICAL,GroupOfStudents.EASY)
    );


    public static void main(String[] args) {
        University testUniversity = new University(allStudent);
        System.out.println(testUniversity.getAllStudent().toString());
        System.out.println(testUniversity.averageStudentGradeCalculator(testUniversity.getStudentFromList("Marc","Mars")));
        System.out.println(testUniversity.averageGradeBySubjectOfGroupAndFaculty("Human Chemical", GroupOfStudents.EASY, TypeFaculity.CHEMICAL));
        System.out.println(testUniversity.averageGradeOfSubjectByAllUniversity("Human Chemical"));
    }
}
