package lesson2.home_work2;

public class Circle extends Shape {
    private Point center;
    private Point pointOnBoard;
    private double radius;

    public Circle(Point center, Point pointOnBoard) {
        this.center = center;
        this.pointOnBoard = pointOnBoard;
    }

    public Circle() {

    }

    @Override
    public double getPerimetr() {
        radius = Math.sqrt(Math.pow((center.getX() - pointOnBoard.getX()), 2) +
                Math.pow((center.getY() - pointOnBoard.getY()), 2));
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        radius = Math.sqrt(Math.pow((center.getX() - pointOnBoard.getX()), 2) +
                Math.pow((center.getY() - pointOnBoard.getY()), 2));
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString(){
        return "circle";
    }

}
