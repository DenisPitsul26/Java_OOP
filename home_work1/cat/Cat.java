package lesson1.homework.cat;

/*
Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
Наделить его свойствами и методами. Создать несколько экземпляров объектов
этого класса. Использовать эти объекты.
 */
public class Cat {
    private String name;
    private int year;
    private String nameOwner;

    public Cat(String name, int year, String nameOwner) {
        this.name = name;
        this.year = year;
        this.nameOwner = nameOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void sleep() {
        System.out.println("Zzz Zzz");
    }

    public void eat() {
        System.out.println("Ham-ham-ham");
    }
}
