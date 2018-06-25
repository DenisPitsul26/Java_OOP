package lesson2.home_work2;

public class Square extends Shape {
    private Point vertexA;
    private Point vertexB;
    private Point vertexC;
    private Point vertexD;
    private double sideAB;
    private double sideBC;
    private double sideCD;
    private double sideDA;
    private double diagonal;

    public Square(Point vertexA, Point vertexB, Point vertexC, Point vertexD) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
        this.vertexD = vertexD;
    }

    public Square() {
    }

    private void calculateSide() {
        sideAB = Math.sqrt(Math.pow((vertexA.getX() - vertexB.getX()), 2) +
                Math.pow((vertexA.getY() - vertexB.getY()), 2));

        sideBC = Math.sqrt(Math.pow((vertexB.getX() - vertexC.getX()), 2) +
                Math.pow((vertexB.getY() - vertexC.getY()), 2));

        sideCD = Math.sqrt(Math.pow((vertexC.getX() - vertexD.getX()), 2) +
                Math.pow((vertexC.getY() - vertexD.getY()), 2));

        sideDA = Math.sqrt(Math.pow((vertexD.getX() - vertexA.getX()), 2) +
                Math.pow((vertexD.getY() - vertexA.getY()), 2));

        diagonal = Math.pow((vertexA.getX() - vertexC.getX()), 2) +
                Math.pow((vertexA.getY() - vertexC.getY()), 2);
    }

    private boolean isSquare() {
        calculateSide();
        if ((sideAB == sideBC) && (sideBC == sideCD) && (sideCD == sideDA) &&
                (2 * Math.pow(sideAB, 2) == diagonal)) {
            return true;
        } else return false;
    }

    @Override
    public double getArea() {
        if (this.isSquare()) {
            return Math.pow(sideAB, 2);
        } else return 0;
    }

    @Override
    public double getPerimetr() {
        if (this.isSquare()) {
            return 4 * sideAB;
        } else return 0;
    }

    @Override
    public String toString() {
        if (this.isSquare()) {
            return "square";
        } else return "something near square";
    }
}
