package lesson10.home_work10.frequency;

public class Main {
    public static void main(String[] args) {
        String [] strTest = new String[]{"I","I","I","AB","AB","C","D"};
        Integer[] intTest = new Integer[]{1,1,1,2,2,3,4,5};

        System.out.println(Count.countFrequency(strTest));
        System.out.println(Count.countFrequency(intTest));
    }
}
