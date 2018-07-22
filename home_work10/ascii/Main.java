package lesson10.home_work10.ascii;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input String: ");
        String inStr = in.nextLine();
        Vocabulary vocabulary = null;
        try {
            vocabulary = new Vocabulary(new File("rep.txt"));
        } catch (IOException e) {
            System.out.println(e);
        }

        vocabulary.writeInASCII(inStr);
    }
}
