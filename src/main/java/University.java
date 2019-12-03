import Facultys.GroupOfStudents;
import Facultys.TypeFaculity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class University {
    private List<Student> allStudent;

    public List<Student> getListStudentsOfBiologicalFaculty() {
        List<Student> listOfBiologists = new ArrayList<>();
        for (Student student : allStudent) {
            if (student.getTypeFaculity().equals(TypeFaculity.BIOLOGY)) {
                listOfBiologists.add(student);
            }
        }
        return listOfBiologists;
    }



    public Student getStudentFromList(String firstName, String lastName) {
        Student searchStudent = new Student();
        for (Student student : allStudent) {
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                searchStudent = student;
            }
        }
        return searchStudent;
    }

    public static List<Subject> getListOfSubjectByFaculty(TypeFaculity faculty) {
        Random randomGrade = new Random();
        int gradeFirst = randomGrade.nextInt(10) + 1;
        int gradeSecond = randomGrade.nextInt(10) + 1;
        switch (faculty) {
            case BIOLOGY:
                return Arrays.asList(new Subject("Human Biology", gradeFirst), new Subject("Animal Biology", gradeSecond));
            case CHEMICAL:
                return Arrays.asList(new Subject("Human Chemical", gradeFirst), new Subject("Animal Chemical", gradeSecond));
            case PHYSICAL:
                return Arrays.asList(new Subject("Human Physics", gradeFirst), new Subject("Animal Physics", gradeSecond));
            default:
                return new ArrayList<>();
        }
    }

    public static List<Subject> addSubjectsOfGroup(GroupOfStudents groupOfStudents) {
        Random randomGrade = new Random();
        int gradeFirst = randomGrade.nextInt(10) + 1;
        int gradeSecond = randomGrade.nextInt(10) + 1;
        switch (groupOfStudents) {
            case EASY:
                return Arrays.asList(new Subject("PE", gradeFirst), new Subject("Art", gradeSecond));
            case NORMAL:
                return Arrays.asList(new Subject("History", gradeFirst), new Subject("Geography", gradeSecond));
            case HARD:
                return Arrays.asList(new Subject("Science", gradeFirst), new Subject("Math", gradeSecond));
            default:
                return new ArrayList<>();
        }
    }


    public List<Student> getListStudentsOfChemicalFaculty() {
        List<Student> listOfChemists = new ArrayList<>();
        for (Student student : allStudent) {
            if (student.getTypeFaculity().equals(TypeFaculity.CHEMICAL)) {
                listOfChemists.add(student);
            }
        }
        return listOfChemists;
    }

    public List<Student> getListStudentsOfPhysicalFaculty() {
        List<Student> listOfPhysics = new ArrayList<>();
        for (Student student : allStudent) {
            if (student.getTypeFaculity().equals(TypeFaculity.PHYSICAL)) {
                listOfPhysics.add(student);
            }
        }
        return listOfPhysics;
    }


    //This method calculates the average mark in all subjects of the student
    public float averageStudentGradeCalculator(Student student) {
        int average = 0;
        int countSubject = 0;
        for (Subject subject : student.getStudentSubjects()) {
            average += subject.getGrade();
            countSubject++;
        }
        return (float) average / countSubject;
    }


    //This method calculates the average score for a specific subject in a specific group and at a specific faculty
    public float averageGradeBySubjectOfGroupAndFaculty(String subjectSearch, GroupOfStudents group, TypeFaculity faculty) {
        int average = 0;
        int countSubjects = 0;
        List<Student> tempList = new ArrayList<>();
        for (Student student : allStudent) {
            if (faculty.equals(student.getTypeFaculity()) && group.equals(student.getGroupOfStudents())) {
                tempList.add(student);
            }
        }
        for (Student student : tempList) {
            for (Subject subject : student.getStudentSubjects()) {
                if (subjectSearch.equals(subject.getNameSubject())) {
                    average += subject.getGrade();
                    countSubjects++;
                }
            }
        }
        return (float) average/countSubjects;
    }


    //This method calculates the average grade for an entire university
    public float averageGradeOfSubjectByAllUniversity(String subjectSearch){
        int average = 0;
        int countSubjects = 0;
        for (Student student: allStudent){
            for (Subject subject:student.getStudentSubjects()){
                if (subjectSearch.equals(subject.getNameSubject())) {
                    average += subject.getGrade();
                    countSubjects++;
                }
            }
        }
        return (float) average/countSubjects;
    }

    public List<Student> getAllStudent() {
        return allStudent;
    }

    public University(List<Student> allStudent) {
        this.allStudent = allStudent;
    }


}