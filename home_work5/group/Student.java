package lesson5.home_work5.group;

public class Student extends Human {
    private String groupName;
    private long studentID;

    public Student(String firstName, String lastName, int age, boolean sex, long studentID) {
        super(firstName, lastName, age, sex);
        this.groupName = "None";
        this.studentID = studentID;
    }

    public Student() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\t" + groupName +
                "\t" + studentID;
    }


}
