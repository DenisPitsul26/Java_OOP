package lesson6.home_work6.sum_array;

public class SumArray implements Runnable{
    private int [] array;
    private int indexFrom;
    private int indexTo;
    private int sum=0;

    public SumArray(int[] array, int indexFrom, int indexTo) {
        this.array = array;
        this.indexFrom = indexFrom;
        this.indexTo = indexTo;
    }

    public SumArray() {
    }

    public int getSum() {
        return sum;
    }

    public void  calculateSumArray(){
        if (indexFrom<0 || indexTo >=array.length){
            throw new IllegalArgumentException("There aren't correct index.");
        }
        for (int i=indexFrom;i<indexTo;i++){
            sum+=array[i];
        }
    }

    @Override
    public void run() {
        this.calculateSumArray();
    }
}
