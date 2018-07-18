package lesson9.home_work9.group;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group myGroup = new Group("Java_OOP");
        Group notMyGroup = new Group("Prizov2018");
        Voenkom voenkom;
        voenkom = myGroup::getPrizovnik;
        List<Student> prizov;

//        File group = new File("group.hz");
//        File prizovnik = new File("prizovnik.hz");


            myGroup.addStudent(new Student("Ivan", "Tkach", 18, false, 1126332));
            myGroup.addStudent(new Student("Oleg", "Bor", 21, false, 1126333));
            myGroup.addStudent(new Student("Olga", "Voron", 18, true, 1126335));
            myGroup.addStudent(new Student("Anna", "Dobro", 18, true, 1126336));
            myGroup.addStudent(new Student("Anna", "Lodz", 15, true, 1126337));
            myGroup.addStudent(new Student("Roman", "Rolex", 20, false, 112233));
            myGroup.addStudent(new Student("John", "Doe", 25, false, 112239));
            myGroup.addStudent(new Student("Taras", "Mashar", 17, false, 112234));
            myGroup.addStudent(new Student("Serhii", "Nazarchuk", 50, false, 112240));
            myGroup.addStudent(new Student("Nastya", "Stepanenko", 19, true, 112241));
            myGroup.addStudent(new Student("Nastya", "Stepanenko", 19, true, 112241));


        prizov = myGroup.getPrizovnik();
        notMyGroup.addAllStudents(prizov);

        System.out.println("\tMy group");
        System.out.println(myGroup);

        myGroup.sort();
        System.out.println("\tSorted my group");
        System.out.println(myGroup);

        System.out.println("\tNot my group");
        System.out.println(notMyGroup);


//        try {
//            SerializableGroup.saveGroup(group, myGroup);
//            SerializableGroup.saveGroup(prizovnik, notMyGroup);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        Group readMyGroup = null;
//        Group readNotMyGroup = null;
//
//        try {
//            readMyGroup = SerializableGroup.loadGroup(group);
//            readNotMyGroup = SerializableGroup.loadGroup(prizovnik);
//        } catch (IOException e) {
//            System.out.println(e);
//        } catch (ClassNotFoundException e) {
//            System.out.println(e);
//        }
//
//        System.out.println(readMyGroup);
//        System.out.println(readNotMyGroup);

    }
}
