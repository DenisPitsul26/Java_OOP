package lesson4.home_work4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Group myGroup = new Group("Java_OOP");
        Voenkom voenkom;
        voenkom = myGroup::getPrizovnik;
        try {
            System.out.println(myGroup.addStudent());
            System.out.println(myGroup.addStudent(new Student("Ivan", "Tkach", 18, false, 1126332)));
            System.out.println(myGroup.addStudent(new Student("Oleg", "Bor", 21, false, 1126333)));
            System.out.println(myGroup.addStudent(new Student("Olga", "Voron", 18, true, 1126335)));
            System.out.println(myGroup.addStudent(new Student("Anna", "Dobro", 18, true, 1126336)));
            System.out.println(myGroup.addStudent(new Student("Anna", "Lodz", 15, true, 1126337)));
            System.out.println(myGroup.addStudent(new Student("Roman", "Rolex", 20, false, 112233)));
            System.out.println(myGroup.addStudent(new Student("John", "Doe", 25, false, 112239)));
            System.out.println(myGroup.addStudent(new Student("Taras", "Mashar", 17, false, 112234)));
            System.out.println(myGroup.addStudent(new Student("Serhii", "Nazarchuk", 50, false, 112240)));
            System.out.println(myGroup.addStudent(new Student("Nastya", "Stepanenko", 19, true, 112241)));
            System.out.println(myGroup.addStudent(new Student("Nastya", "Stepanenko", 19, true, 112241)));

        } catch (GroupIsFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myGroup.toString());

        System.out.println(myGroup.searchStudent("Voron"));

        System.out.println(myGroup.removeStudent(1126332));
        System.out.println(myGroup.removeStudent(1126332));
        System.out.println(myGroup.removeStudent(1126333));

        myGroup.sort(1);
        System.out.println(myGroup.toString());

        myGroup.sort(2);
        System.out.println(myGroup.toString());

        myGroup.sort(3);
        System.out.println(myGroup.toString());



        for (Student student: voenkom.getPrizovnik()) {
            System.out.println(student.toString());
        }



    }
}
