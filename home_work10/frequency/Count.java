package lesson10.home_work10.frequency;

import java.util.HashMap;
import java.util.Map;

public class Count {

    public static <T> String countFrequency(T[] arr) {
        Map<T, Integer> map = new HashMap<>();
        for (T element : arr) {
            Integer count = map.get(element);
            if (count == null) {
                map.put(element, 1);
            } else {
                map.put(element, count + 1);
            }
        }
        return map.toString();
    }

}
