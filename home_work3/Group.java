package lesson3.home_work3;

public class Group {
    private String name;
    private Student[] group = new Student[10];

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

    public Student[] getGroup() {
        return group;
    }

    public String addStudent(Student newStudent) throws GroupIsFullException {
        if (newStudent == null) {
            throw new IllegalArgumentException("This ia null");
        }
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = newStudent;
                newStudent.setGroupName(this.name);
                return "Done";
            }
        }
        throw new GroupIsFullException();
    }

    public String removeStudent(long studentID) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getStudentID() == studentID) {
                group[i] = null;
                return "Done";
            }
        }
        return "Student is not found";
    }

    public Student searchStudent(String name) {
        if (name == null) {
            throw new IllegalArgumentException("This is null");
        }
        for (Student student : group) {
            if (student != null && student.getLastName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    private void sort() {
        for (int i = 1; i < group.length; i++) {
            for (int j = i; j > 0 && compare(group[j - 1], group[j]) > 0; j--) {
                Student temp = group[j - 1];
                group[j - 1] = group[j];
                group[j] = temp;
            }
        }
    }

    private int compare(Student a, Student b) {
        if (a == null && b != null) {
            return 1;    //null > student
        }
        if (a != null && b == null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        } else {
            return a.getLastName().compareTo(b.getLastName());
        }
    }

    @Override
    public String toString() {
        sort();
        StringBuilder result = new StringBuilder();
        for (Student student : group) {
            if (student != null) {
                result.append(student.toString());
                result.append("\n");
            }
        }
        return result.toString();
    }
}
