public class Subject {
    private String nameSubject;
    private int grade;

    public Subject(String nameSubject, int grade) {
        this.nameSubject = nameSubject;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public String toString() {
        return  nameSubject + " " + grade;
    }


}
