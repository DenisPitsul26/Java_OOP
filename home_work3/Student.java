package lesson3.home_work3;

public class Student extends Human {
    private String groupName;
    private long studentID;

    public Student(String firstName, String lastName, int age, boolean sex, String groupName, long studentID) {
        super(firstName, lastName, age, sex);
        this.groupName = groupName;
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
                " groupName='" + groupName +
                ", studentID=" + studentID;
    }


}
