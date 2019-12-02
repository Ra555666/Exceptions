//import java.util.List;
//
//public class Group {
//    private List<Student> listStudentGroup;
//
//    public float averageGradeGroup(String subject){
//        float averageGrade = 0;
//        int studentsWithSubject=0;
//        for (Student student: listStudentGroup){
//            List<Subject> tempList = student.getStudentSubjects();
//            for (Subject sub: tempList){
//                if(subject.equals(sub.getNameSubject())){
//                    studentsWithSubject++;
//                    averageGrade+=University.averageGradeCalculator(tempList);
//                }
//            }
//        }
//        return averageGrade/studentsWithSubject;
//    }
//
//}
