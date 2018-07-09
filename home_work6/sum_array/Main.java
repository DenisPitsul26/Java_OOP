package lesson6.home_work6.sum_array;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int [] myArray = new int[160000000];
        int sum1=0;
        int sum2=0;
        long timeStart;
        long timeFinish;
        for (int i=0;i<myArray.length;i++){
            myArray[i]=((int)(Math.random()*11));
        }

        timeStart=System.currentTimeMillis();
        for (int arr: myArray) {
            sum1+=arr;
        }
        timeFinish=System.currentTimeMillis();
        System.out.println("SUM= "+sum1);
        System.out.println("Time: "+(timeFinish-timeStart));


        SumArray sumArray1 = new SumArray(myArray,0,40_000_000);
        SumArray sumArray2 = new SumArray(myArray,40_000_000,80_000_000);
        SumArray sumArray3 = new SumArray(myArray,80_000_000,120_000_000);
        SumArray sumArray4 = new SumArray(myArray,120_000_000,160_000_000-1);

        Thread thread1 = new Thread(sumArray1);
        Thread thread2 = new Thread(sumArray2);
        Thread thread3 = new Thread(sumArray3);
        Thread thread4 = new Thread(sumArray4);

        timeStart=System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sum2=sumArray1.getSum()+sumArray2.getSum()+sumArray3.getSum()+sumArray4.getSum()+myArray[myArray.length-1];
        timeFinish=System.currentTimeMillis();
        System.out.println("\nSUM= "+sum2);
        System.out.println("Time: "+(timeFinish-timeStart));

    }
}
