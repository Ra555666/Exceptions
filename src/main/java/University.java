import Facultys.GroupOfStudents;
import Facultys.TypeFaculity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class University {
    private List<Student> allStudent;

    public List<Student> getListStudentsOfBiologicalFaculity() {
        List<Student> listOfBiologists = new ArrayList<>();
        for (Student student : allStudent) {
            if (student.getTypeFaculity().equals(TypeFaculity.BIOLOGY)) {
                listOfBiologists.add(student);
            }
        }
        return listOfBiologists;
    }

    public Student getStudentFromList(String firstName, String lastName){
        Student searchStudent = new Student();
        for (Student student: allStudent){
            if (firstName.equals(student.getFirstName())&& lastName.equals(student.getLastName())){
                searchStudent = student;
            }
        }
        return searchStudent;
    }

    public static List<Subject> getlistOfSubjectByFaculty(TypeFaculity faculity){
        Random randomGrade = new Random();
        int gradeFirst = randomGrade.nextInt(10)+1;
        int gradeSecond = randomGrade.nextInt(10)+1;
        switch (faculity){
            case BIOLOGY:
                return Arrays.asList(new Subject("Human Biology",gradeFirst),new Subject("Animal Biology", gradeSecond));
            case CHEMICAL:
                return Arrays.asList(new Subject("Human Chemical", gradeFirst), new Subject("Animal Chemical",gradeSecond ));
            case PHYSICAL:
                return Arrays.asList(new Subject("Human Physics",gradeFirst),new Subject("Animal Physics",gradeSecond));
            default:
                return new ArrayList<>();
        }
    }

    public static List<Subject> addSubjectsOfGroup(GroupOfStudents groupOfStudents){
        Random randomGrade = new Random();
        int gradeFirst = randomGrade.nextInt(10)+1;
        int gradeSecond = randomGrade.nextInt(10)+1;
        switch (groupOfStudents){
            case EASY:
                return Arrays.asList(new Subject("PE", gradeFirst),new Subject("Art", gradeSecond));
            case NORMAL:
                return Arrays.asList(new Subject("History", gradeFirst), new Subject("Geography", gradeSecond));
            case HARD:
                return Arrays.asList(new Subject("Science",gradeFirst), new Subject("Math", gradeSecond));
            default:
                return new ArrayList<>();
        }
    }


    public List<Student> getListStudentsOfChemicalFaculity() {
        List<Student> listOfChemists = new ArrayList<>();
        for (Student student : allStudent) {
            if (student.getTypeFaculity().equals(TypeFaculity.CHEMICAL)) {
                listOfChemists.add(student);
            }
        }
        return listOfChemists;
    }

    public List<Student> getListStudentsOfPhysicalFaculity() {
        List<Student> listOfPhysics = new ArrayList<>();
        for (Student student : allStudent) {
            if (student.getTypeFaculity().equals(TypeFaculity.PHYSICAL)) {
                listOfPhysics.add(student);
            }
        }
        return listOfPhysics;
    }

    public float averageGradeCalculator(Student student) {
        int average = 0;
        int numSubject = 0;
        for (Subject subject : student.getStudentSubjects()) {
            average += subject.getGrade();
            numSubject++;
        }
        return (float) average / numSubject;
    }

    public List<Student> getAllStudent(){
        return allStudent;
    }

    public University(List<Student> allStudent){
        this.allStudent = allStudent;
    }



}