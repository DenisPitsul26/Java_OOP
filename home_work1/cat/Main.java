package lesson1.homework.cat;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat( "Cat",3,"Max");
        Cat notMyCat = new Cat ("Barsik",1,"Oleg");

        myCat.sleep();
        notMyCat.eat();
    }
}
