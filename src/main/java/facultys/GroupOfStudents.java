package facultys;

public enum GroupOfStudents {
    EASY("I Can Win"),
    NORMAL("Hurt Me Plenty"),
    HARD("Nightmare!");

    private String groupTitle;

    GroupOfStudents(String groupTitle){
        this.groupTitle = groupTitle;
    }

    public String getGroupTitle() {
        return groupTitle;
    }
}
