package lesson9.home_work9.group;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Group implements Serializable {
    private String name;
    private List<Student> group = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public Group() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getGroup() {
        return group;
    }


    public boolean addStudent(Student newStudent) {
        if (newStudent == null) {
            throw new IllegalArgumentException("This ia null");
        }
        for (Student student:group){
            if (student.equals(newStudent)){
                return false;
            }
        }
        group.add(newStudent);
        return true;

    }
    public void addAllStudents(List<Student> list){
        if (list == null) {
            throw new IllegalArgumentException("This ia null");
        }
        group.addAll(list);
    }


    public boolean removeStudent(long studentID) {
        Iterator<Student> itr = group.iterator();
        while (itr.hasNext()) {
            if (itr.next().getStudentID() == studentID) {
                itr.remove();
                return true;
            }
        }
        return false;
    }

    public Student searchStudent(String name) {
        if (name == null) {
            throw new IllegalArgumentException("This is null");
        }
        Iterator<Student> itr = group.iterator();
        Student temp;
        while (itr.hasNext()) {
            temp = itr.next();
            if (temp.getFirstName().equals(name) || temp.getLastName().equals(name)) {
                return temp;
            }
        }
        return null;
    }


    public void sort() {
        group.sort((a, b) -> {
            if (a == null && b != null) {
                return -1;    //null > student
            }
            if (a != null && b == null) {
                return 1;
            }
            if (a == null && b == null) {
                return 0;
            } else {
                return a.getFirstName().compareTo(b.getFirstName());
            }
        });
    }

    public List<Student> getPrizovnik() {
        List<Student> prizov = new ArrayList<>();
        Iterator<Student> itr = group.iterator();
        Student temp;
        while (itr.hasNext()){
            temp = itr.next();
            if (!temp.isSex() && temp.getAge()>=18){
                prizov.add(temp);
            }
        }
        return prizov;
    }

    public void saveToFile(String name) {
        try (Writer os = new FileWriter(new File(name))) {
            os.write(toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        for (Student student : group) {
            result.append(student).append(System.lineSeparator());
        }
        return result.toString();
    }
}
