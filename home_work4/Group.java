package lesson4.home_work4;

import javax.swing.JOptionPane;
import java.util.Arrays;

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
                return "Student add.";
            }
        }
        throw new GroupIsFullException();
    }

    public String addStudent() throws GroupIsFullException {
        String firstName;
        String lastName;
        int age;
        boolean sex;
        long studentID;
        String temp;
        for (; ; ) {
            try {
                firstName = JOptionPane.showInputDialog("Input first name");
                break;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error. You must input first name.");
            }
        }

        for (; ; ) {
            try {
                lastName = JOptionPane.showInputDialog("Input last name");
                break;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error. You must input last name.");
            }
        }

        for (; ; ) {
            try {
                age = Integer.valueOf(JOptionPane.showInputDialog("Input age"));
                if (age <= 0) {
                    throw new NotCorrectAgeException();
                }
                break;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error. You must input age.");
            } catch (NotCorrectAgeException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error number format.");
            }
        }
        for (; ; ) {
            try {
                temp = JOptionPane.showInputDialog("Input sex: M or W");
                if (temp.equals("M")) {
                    sex = false;
                } else if (temp.equals("W")) {
                    sex = true;
                } else {
                    throw new NotCorrectSexException();
                }
                break;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error. You must input sex.");
            } catch (NotCorrectSexException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        for (; ; ) {
            try {
                studentID = Long.valueOf(JOptionPane.showInputDialog("Input studentID"));
                break;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error. You must input studentID.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error number format.");
            }
        }

        addStudent(new Student(firstName, lastName, age, sex, studentID));

        return "Student add.";
    }

    public String removeStudent(long studentID) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getStudentID() == studentID) {
                group[i] = null;
                return "Student deleted.";
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


    public void sort(int n) {
        //Sort by lastName
        if (n == 1) {
            Arrays.sort(group, (a, b) -> {
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
            });
            return;
        }
        //Sort by ascending age.
        if (n == 2) {
            Arrays.sort(group, (a, b) -> {
                if (a == null && b != null) {
                    return 1;    //null > student
                }
                if (a != null && b == null) {
                    return -1;
                }
                if (a == null && b == null) {
                    return 0;
                } else {
                    return a.getAge() - b.getAge();
                }
            });
            return;
        }
        //Sort by descent age.
        if (n == 3) {
            Arrays.sort(group, (a, b) -> {
                if (a == null && b != null) {
                    return 1;    //null > student
                }
                if (a != null && b == null) {
                    return -1;
                }
                if (a == null && b == null) {
                    return 0;
                } else {
                    return -(a.getAge() - b.getAge());
                }
            });
            return;
        }
    }

    public Student[] getPrizovnik() {
        int n = 0;
        for (Student student : group) {
            if (student != null && !student.isSex() && student.getAge() > 18) {
                n++;
            }
        }

        Student[] tempGroup = new Student[n];
        n=0;

        for (Student student : group) {
            if (student != null && !student.isSex() && student.getAge() > 18) {
                tempGroup[n]=student;
                n++;
            }
        }
        return tempGroup;
    }
        @Override
        public String toString () {
            //   sort();
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
