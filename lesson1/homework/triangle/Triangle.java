package lesson1.homework.triangle;
/*
Описать класс «Triangle». В качестве свойств возьмите длины сторон
треугольника. Реализуйте метод, который будет возвращать площадь этого
треугольника. Создайте несколько объектов этого класса и протестируйте их.
     */
public class Triangle {

    private double a, b, c;
    private double poluperimetr;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double square() {
        if (!(a + b > c && a + c > b && b + c > a)) {
            return 0;
        }
        poluperimetr=(a+b+ c)/2;
        return Math.sqrt(poluperimetr*(poluperimetr-a)*(poluperimetr-b)*(poluperimetr- c));
    }
}
