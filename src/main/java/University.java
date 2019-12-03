import Facultys.GroupOfStudents;
import Facultys.TypeFaculity;

import java.util.*;

public class University {
    private List<Student> allStudent;

    public static List<Subject> addListOfSubjectByFaculty(TypeFaculity faculty) {
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

    public static List<Subject> addSubjectsOfGroupToSubjectList(GroupOfStudents groupOfStudents) {
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

    public Student getStudentFromListOfStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Input last name: ");
        String lastName = scanner.nextLine();
        Student searchStudent = new Student();
        for (Student student : allStudent) {
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                searchStudent = student;
            }
        }
        return searchStudent;
    }

    //This method calculates the average mark in all subjects of the student
    public void averageStudentGradeCalculator(Student student) {
        int average = 0;
        int countSubject = 0;
        for (Subject subject : student.getStudentSubjects()) {
            average += subject.getGrade();
            countSubject++;
        }
        System.out.println("Average grade " + student.getFirstName() + " " + student.getLastName() + " is " + (float) average / countSubject);
    }


    //This method calculates the average score for a specific subject in a specific group and at a specific faculty
    public void averageGradeBySubjectOfGroupAndFaculty() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input subject: ");
        String subjectSearch = scanner.nextLine();
        System.out.print("Input group: ");
        String group = scanner.nextLine();
        System.out.print("Input faculty: ");
        String faculty = scanner.nextLine();
        int average = 0;
        int countSubjects = 0;
        List<Student> tempList = new ArrayList<>();
        for (Student student : allStudent) {
            if (faculty.equals(student.getTypeFaculity().getFacultyTitle()) && group.equals(student.getGroupOfStudents().getGroupTitle())) {
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
        System.out.println("Average grade of " + subjectSearch + " on group " + group + " on " + faculty + " faculty is " + (float) average / countSubjects);

    }


    //This method calculates the average grade for an entire university
    public void averageGradeOfSubjectByAllUniversity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name  of subject: ");
        String subjectSearch = scanner.nextLine();
        int average = 0;
        int countSubjects = 0;
        for (Student student : allStudent) {
            for (Subject subject : student.getStudentSubjects()) {
                if (subjectSearch.equals(subject.getNameSubject())) {
                    average += subject.getGrade();
                    countSubjects++;
                }
            }
        }
        System.out.println("Average grade of " + subjectSearch + " by whole university is " + (float) average / countSubjects);

    }

    public List<Student> getAllStudent() {
        return allStudent;
    }

    public University(List<Student> allStudent) {
        this.allStudent = allStudent;
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

    public List<Student> getListStudentsOfBiologicalFaculty() {
        List<Student> listOfBiologists = new ArrayList<>();
        for (Student student : allStudent) {
            if (student.getTypeFaculity().equals(TypeFaculity.BIOLOGY)) {
                listOfBiologists.add(student);
            }
        }
        return listOfBiologists;
    }


}