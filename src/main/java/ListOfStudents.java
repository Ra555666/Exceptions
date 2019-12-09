import facultys.GroupOfStudents;
import facultys.TypeFaculity;

import java.util.Arrays;
import java.util.List;

public class ListOfStudents {
    //    static List<Student> allStudent = Arrays.asList(
//            new Student("John","Smith", TypeFaculity.PHYSICAL, GroupOfStudents.EASY),
//            new Student("Martin","Goose", TypeFaculity.PHYSICAL, GroupOfStudents.NORMAL),
//            new Student("Paul", "Pig", TypeFaculity.PHYSICAL,GroupOfStudents.EASY),
//            new Student("Antony", "Bee", TypeFaculity.PHYSICAL, GroupOfStudents.NORMAL),
//            new Student("Mathew", "Parry", TypeFaculity.PHYSICAL,GroupOfStudents.EASY),
//            new Student("Marc", "Mars", TypeFaculity.BIOLOGY,GroupOfStudents.HARD),
//            new Student("John","Doe", TypeFaculity.BIOLOGY,GroupOfStudents.EASY),
//            new Student("Calvin", "Crane", TypeFaculity.BIOLOGY,GroupOfStudents.HARD),
//            new Student("Timothy", "Gunn", TypeFaculity.BIOLOGY,GroupOfStudents.EASY),
//            new Student("Ray", "Whore", TypeFaculity.BIOLOGY,GroupOfStudents.NORMAL),
//            new Student("Josh", "Jew", TypeFaculity.CHEMICAL,GroupOfStudents.NORMAL),
//            new Student("Nick", "Stone", TypeFaculity.CHEMICAL,GroupOfStudents.HARD),
//            new Student("Daris", "Heris", TypeFaculity.CHEMICAL,GroupOfStudents.EASY),
//            new Student("Phill", "Mouth", TypeFaculity.CHEMICAL,GroupOfStudents.NORMAL),
//            new Student("Father", "Mother", TypeFaculity.CHEMICAL,GroupOfStudents.EASY)
//    );

    static List<Student> allStudent = Arrays.asList(
            new Student("Martin","Goose", TypeFaculity.PHYSICAL, GroupOfStudents.NORMAL),
            new Student("Antony", "Bee", TypeFaculity.PHYSICAL, GroupOfStudents.NORMAL),
            new Student("Marc", "Mars", TypeFaculity.BIOLOGY,GroupOfStudents.HARD),
            new Student("Calvin", "Crane", TypeFaculity.BIOLOGY,GroupOfStudents.HARD),
            new Student("Ray", "Whore", TypeFaculity.BIOLOGY,GroupOfStudents.NORMAL),
            new Student("Josh", "Jew", TypeFaculity.CHEMICAL,GroupOfStudents.NORMAL),
            new Student("Nick", "Stone", TypeFaculity.CHEMICAL,GroupOfStudents.HARD),
            new Student("Phill", "Mouth", TypeFaculity.CHEMICAL,GroupOfStudents.NORMAL),
            new Student("Father", "Mother", TypeFaculity.CHEMICAL,GroupOfStudents.EASY)
    );

    public static List<Student> getAllStudent() {
        return allStudent;
    }
}
