package lesson8.home_work8.group;

import java.io.Serializable;

public class Human implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    private boolean sex; // false - man, true - woman

    public Human(String firstName, String lastName, int age, boolean sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return lastName +"\t"+ firstName + "\t" + age;
    }
}
