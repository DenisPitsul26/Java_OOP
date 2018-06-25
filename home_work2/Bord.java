package lesson2.home_work2;

public class Bord {
    private Shape[] bord = new Shape[4];

    public void addShape(Shape shape, int i) {
        if ((i < 1) || (i > 4)) {
            System.out.println("Incorrect index");
            return;
        }
        if (bord[i - 1] != null) {
            System.out.println("This part of bord is not free");
            return;
        }
        bord[i - 1] = shape;
    }

    public void removeShape(int i) {
        if ((i < 1) || (i > 4)) {
            System.out.println("Incorrect index");
            return;
        }
        bord[i - 1] = null;

    }

    @Override
    public String toString() {
        double allArea = 0;
        String result = "\nOn this board are:";

        for (int i = 0; i < 4; i++) {
            result += "\n\t" + (i + 1) + " part: ";

            if (bord[i] != null) {
                allArea += bord[i].getArea();
                result += bord[i].toString();
            } else result += "nothing";
        }

        result += "\nAll area is:" + allArea;
        return result;

    }
}
