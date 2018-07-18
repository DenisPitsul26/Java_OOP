package lesson9.home_work9.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyList {
    private List<Integer> myList = new ArrayList<>();

    private Random holyRandom = new Random(System.currentTimeMillis());

    public void madeHomeWork() {
        for (int i = 1; i <= 10; i++) {
            myList.add(holyRandom.nextInt(i * 6546516));
        }

        for (int i = 0; i < 2; i++) {
            myList.remove(0);
        }
        myList.remove(myList.size() - 1);
        System.out.println(myList);
    }

    @Override
    public String toString() {
        return myList.toString();
    }
}
