public class Main {

    public static void main(String[] args) {
        University testUniversity = new University(GeneratorListOfStudents.getAllStudent());
        System.out.println(GeneratorListOfStudents.getAllStudent().toString());

        testUniversity.averageStudentGradeCalculator(testUniversity.getStudentFromListOfStudents());

        testUniversity.averageGradeBySubjectOfGroupAndFaculty();

        testUniversity.averageGradeOfSubjectByAllUniversity();

        System.out.println(testUniversity.getListStudentsOfEasyGroup());
    }
}
