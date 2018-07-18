package lesson9.home_work9.group;

import java.io.Serializable;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                sex == human.sex &&
                Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, age, sex);
    }

    @Override
    public String toString() {
        return "Human:" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex;
    }
}
