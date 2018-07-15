package lesson8.home_work8.group;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        Group myGroup = new Group("Java_OOP");
        Group notMyGroup = new Group("Prizov2018");
        Voenkom voenkom;
        voenkom = myGroup::getPrizovnik;
        Student[] prizov;

        File group = new File("group.hz");
        File prizovnik = new File("prizovnik.hz");

        try {
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
        prizov = myGroup.getPrizovnik();

        for (int i = 0; i < prizov.length; i++) {
            try {
                notMyGroup.addStudent(prizov[i]);
            } catch (GroupIsFullException e) {
                System.out.println(e);
            }
        }

        try {
            SerializableGroup.saveGroup(group, myGroup);
            SerializableGroup.saveGroup(prizovnik, notMyGroup);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Group readMyGroup = null;
        Group readNotMyGroup = null;

        try {
            readMyGroup = SerializableGroup.loadGroup(group);
            readNotMyGroup = SerializableGroup.loadGroup(prizovnik);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        System.out.println(readMyGroup);
        System.out.println(readNotMyGroup);

    }
}
