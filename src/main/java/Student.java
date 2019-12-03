import Facultys.GroupOfStudents;
import Facultys.TypeFaculity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private TypeFaculity typeFaculity;
    private GroupOfStudents groupOfStudents;
    private List<Subject> studentSubjects = new ArrayList<>();

    public Student() {
    }

    public Student(String firstName, String lastName, TypeFaculity typeFaculity, GroupOfStudents groupOfStudents) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeFaculity = typeFaculity;
        this.groupOfStudents = groupOfStudents;
        this.studentSubjects.addAll(University.addListOfSubjectByFaculty(typeFaculity));
        this.studentSubjects.addAll(University.addSubjectsOfGroupToSubjectList(groupOfStudents));
    }

    public TypeFaculity getTypeFaculity() {
        return typeFaculity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public GroupOfStudents getGroupOfStudents() {
        return groupOfStudents;
    }

    public List<Subject> getStudentSubjects() {
        return studentSubjects;
    }


    public String toString() {
        return "\n" + "Name: " + firstName + " " + lastName + "\n" +
                "Faculty: " + typeFaculity.getFacultyTitle() + "\n" +
                "Group: " + groupOfStudents.getGroupTitle() + "\n" +
                "Subjects: " + studentSubjects.toString() + "\n";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return firstName.equals(student.firstName) &&
                lastName.equals(student.lastName) &&
                typeFaculity == student.typeFaculity;
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName, typeFaculity);
    }


}
