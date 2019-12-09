import exceptions.*;
import facultys.GroupOfStudents;
import facultys.TypeFaculity;

import java.util.*;

public class University {
    private List<Student> allStudent;

    public University(List<Student> allStudent) {
        this.allStudent = allStudent;
    }


    public static List<Subject> addListOfSubjectByFaculty(TypeFaculity faculty) {
        Random randomGrade = new Random();
        int gradeFirst = randomGrade.nextInt(10) + 1;
        int gradeSecond = randomGrade.nextInt(10) + 1;
//        int gradeFirst = 100;
//        int gradeSecond = 100;
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
        try {
            if (searchStudent.getFirstName() == null) {
                throw new NonAvailabilityStudentException();
            }
        } catch (NonAvailabilityStudentException e) {
            System.err.println("Student is not listed");
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
        float averageGrade = (float) average / countSubject;
        try {
            if (countSubject < 1) {
                throw new TooFewSubjectsException();
            } else if (averageGrade < 0 || averageGrade > 10) {
                throw new WrongGradeException();
            }
        } catch (TooFewSubjectsException e) {
            System.out.println(e.getMessage());
        } catch (WrongGradeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Average grade " + student.getFirstName() + " " + student.getLastName() + " is " + averageGrade);
    }

    public float averageStudentGradeCalculator(List<Student> studentsList, String subjectSearch) {
        int average = 0;
        int countSubjects = 0;
        for (Student student : studentsList) {
            for (Subject subject : student.getStudentSubjects()) {
                if (subjectSearch.equals(subject.getNameSubject())) {
                    average += subject.getGrade();
                    countSubjects++;
                }
            }
        }
        return (float) average / countSubjects;
    }


    //This method calculates the average score for a specific subject in a specific group and at a specific faculty
    public void averageGradeBySubjectOfGroupAndFaculty() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input subject: ");
        String subjectSearch = scanner.nextLine();
        System.out.print("Input group: ");
        String group = scanner.nextLine();
        try {
            switch (group) {
                case "I Can Win":
                case "Hurt Me Plenty":
                case "Nightmare!":
                    break;
                default:
                    throw new LackOfGroupsOnFacultyException();
            }
        } catch (LackOfGroupsOnFacultyException e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Input faculty: ");
        String faculty = scanner.nextLine();
        List<Student> tempList = new ArrayList<>();
        for (Student student : allStudent) {
            if (faculty.equals(student.getTypeFaculity().getFacultyTitle()) && group.equals(student.getGroupOfStudents().getGroupTitle())) {
                tempList.add(student);
            }
        }
        System.out.println("Average grade of " + subjectSearch + " on group " + group + " on " + faculty + " faculty is " + averageStudentGradeCalculator(tempList, subjectSearch));
    }


    //This method calculates the average grade for an entire university
    public void averageGradeOfSubjectByAllUniversity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name  of subject: ");
        String subjectSearch = scanner.nextLine();
        System.out.println("Average grade of " + subjectSearch + " by whole university is " + averageStudentGradeCalculator(allStudent, subjectSearch));
    }


    public List<Student> getListStudentsOfEasyGroup() {
        List<Student> listEasy = new ArrayList<>();
        for (Student student : allStudent) {
            if (student.getGroupOfStudents().equals(GroupOfStudents.EASY)) {
                listEasy.add(student);
            }
        }
        try {
            if (listEasy.isEmpty()) {
                throw new EmptyGroupException();
            }
        } catch (EmptyGroupException e) {
            System.out.println(e.getMessage());
        }
        return listEasy;
    }
}