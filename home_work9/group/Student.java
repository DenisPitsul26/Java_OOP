package lesson9.home_work9.group;

import java.io.Serializable;
import java.util.Objects;

public class Student extends Human implements Serializable {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentID == student.studentID &&
                Objects.equals(groupName, student.groupName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getGroupName(), getStudentID());
    }

    @Override
    public String toString() {
        return super.getFirstName()+" "+super.getLastName()+", "+super.getAge()+" year, "+ studentID;
    }
}
