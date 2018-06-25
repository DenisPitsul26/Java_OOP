package lesson2.home_work2;

public class Main {
    public static void main(String[] args) {
        Point onePoint = new Point(2.3,4.0);
        Point twoPoint = new Point(5.1,6.0);
        Point threePoint = new Point(7.5,6.9);
        Point fourPoint = new Point(3,4);
        Point fivePoint = new Point(4.1,8.5);
        Point sixPoint = new Point(0,0);
        Point sevenPoint = new Point(0,5);
        Point eightPoint = new Point(5,5);
        Point ninePoint = new Point(5,0);


        Shape firstShape = new Triangle(onePoint,twoPoint,threePoint);
        Shape secondShape = new Circle(fourPoint,fivePoint);
        Shape thirdShape = new Square(sixPoint,sevenPoint,eightPoint,ninePoint);
        Shape fourthShape = new Square(sixPoint,sevenPoint,eightPoint,onePoint);


        Bord myBord = new Bord();
        System.out.println(myBord);

        myBord.addShape(firstShape,1);
        myBord.addShape(firstShape,5);
        myBord.addShape(secondShape,2);
        myBord.addShape(thirdShape,3);
        myBord.addShape(fourthShape,4);
        myBord.addShape(secondShape,4);

        System.out.println(myBord);
        myBord.removeShape(4);
        System.out.println(myBord);

    }
}
