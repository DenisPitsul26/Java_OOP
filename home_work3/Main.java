package lesson3.home_work3;

public class Main {
    public static void main(String[] args) {
        Group myGroup = new Group("Java_OOP");
        try {
            myGroup.addStudent(new Student("Ivan","Tkach", 18, false,"Java",1126332 ));
            myGroup.addStudent(new Student("Oleg","Bor", 21, false,"Java",1126333 ));
            myGroup.addStudent(new Student("Olga","Voron", 18, true,"Java",1126335 ));
            myGroup.addStudent(new Student("Anna","Dobro", 18, true,"Java",1126336 ));
            myGroup.addStudent(new Student("Anna","Lodz", 18, true,"Java",1126337 ));
            myGroup.addStudent(new Student("Roman", "Rolex",20, false,"Java",112233));
            myGroup.addStudent(new Student("John", "Doe",15, false,"Java",112239));
            myGroup.addStudent(new Student("Taras", "Mashar",17, false,"Java",112234));
            myGroup.addStudent(new Student("Serhii", "Nazarchuk",17, false,"Java",112240));
            myGroup.addStudent(new Student("Nastya", "Stepanenko",19, true, "java", 112241));
            myGroup.addStudent(new Student("Nastya", "Stepanenko",19, true, "java", 112241));

        } catch (GroupIsFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myGroup.toString());

        System.out.println(myGroup.searchStudent("Voron"));

        System.out.println(myGroup.removeStudent(1126332));
        System.out.println(myGroup.removeStudent(1126332));
        System.out.println(myGroup.removeStudent(1126333));
        System.out.println(myGroup.removeStudent(1126335));

        System.out.println(myGroup.toString());






    }
}
