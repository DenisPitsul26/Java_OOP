package lesson1.homework.triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.2, 4, 5);
        Triangle notTriangle = new Triangle (100, 5, 6);
        System.out.println(triangle.square());
        System.out.println(notTriangle.square());
    }
}
