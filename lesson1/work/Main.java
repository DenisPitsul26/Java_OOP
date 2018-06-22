package lesson1.work;

import lesson1.work.Car;

public class Main {
    public static void main(String[] args) {

        Car carOne = new Car();
        carOne.color="White";
        carOne.weight=1100;
        System.out.println(carOne);

        System.out.println();

        Car carTwo = new Car();
        carTwo.color="Green";
        carTwo.weight=865;
        System.out.println(carTwo);


    }
}
