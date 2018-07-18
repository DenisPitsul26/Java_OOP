package lesson9.home_work9.magic_cola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfGlasses;
        System.out.print("Enter how many cola glasses have been drunk: ");
        try {
            numberOfGlasses = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Sorry, but it isn't number =(");
            return;
        }

        DoubleCola myTestQueue = new DoubleCola();
        System.out.println(myTestQueue.numberGlass(numberOfGlasses));

    }
}
