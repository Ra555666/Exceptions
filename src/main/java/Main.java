public class Main {

    public static void main(String[] args) {
        University testUniversity = new University(GeneratorOfStudents.getAllStudent());
        System.out.println(GeneratorOfStudents.getAllStudent().toString());

        testUniversity.averageStudentGradeCalculator(testUniversity.getStudentFromListOfStudents());

        testUniversity.averageGradeBySubjectOfGroupAndFaculty();

        testUniversity.averageGradeOfSubjectByAllUniversity();

        System.out.println(testUniversity.getListStudentsOfEasyGroup());
    }
}
