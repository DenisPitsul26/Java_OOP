package lesson2.home_work2;


public class Triangle extends Shape {

    private Point vertexA;
    private Point vertexB;
    private Point vertexC;
    private double sideAB;
    private double sideBC;
    private double sideCA;
    private double poluperimetr;

    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    public Triangle() {

    }


    private void calculateSide() {
        sideAB = Math.sqrt(Math.pow((vertexA.getX() - vertexB.getX()), 2) +
                Math.pow((vertexA.getY() - vertexB.getY()), 2));

        sideBC = Math.sqrt(Math.pow((vertexB.getX() - vertexC.getX()), 2) +
                Math.pow((vertexB.getY() - vertexC.getY()), 2));

        sideCA = Math.sqrt(Math.pow((vertexA.getX() - vertexC.getX()), 2) +
                Math.pow((vertexA.getY() - vertexC.getY()), 2));


    }


    @Override
    double getPerimetr() {
        this.calculateSide();
        return sideAB + sideBC + sideCA;

    }


    @Override
    double getArea() {
        this.calculateSide();
        poluperimetr = (sideAB + sideCA + sideBC) / 2;
        return Math.sqrt(poluperimetr * (poluperimetr - sideBC) * (poluperimetr - sideCA) * (poluperimetr - sideAB));
    }

    @Override
    public String toString() {
        return "triangle";
    }
}
