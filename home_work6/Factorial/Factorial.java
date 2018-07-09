package lesson6.home_work6.Factorial;

import java.math.BigInteger;

public class Factorial implements Runnable{
    private int number;

    public Factorial (int number){
        this.number=number;
    }
    public Factorial(){

    }

    private BigInteger calculateFactorial(int n){
        BigInteger factorail = new BigInteger("1");
        for (int i=2;i<=n;i++){
            factorail=factorail.multiply(new BigInteger(Integer.toString(i)));
        }
        return factorail;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+": "+number+"! = "+ calculateFactorial(number));
    }
}
