package lesson9.home_work9.magic_cola;


import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleCola {
    private Deque<String> queueCola = new ArrayDeque<>();

    public DoubleCola() {
        queueCola.add("Sheldon");
        queueCola.add("Leonard");
        queueCola.add("Volovitc");
        queueCola.add("Kutrapalli");
        queueCola.add("Penny");
    }

    public DoubleCola(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Null reference");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                queueCola.add(arr[i]);
            }
        }
    }

    public String numberGlass(int n) {
        String temp;
        for (int i = 0; i < n; i++) {
            temp = queueCola.poll();
            for (int j = 0; j < 2; j++) {
                queueCola.add(temp);
            }
        }
        return queueCola.toString();
    }

    @Override
    public String toString() {
        return queueCola.toString();
    }
}
