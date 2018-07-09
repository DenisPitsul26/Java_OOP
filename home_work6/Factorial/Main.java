package lesson6.home_work6.Factorial;

public class Main {
    public static void main(String[] args) {
        Thread [] arrayThread = new Thread[100];
        for (int i=0;i<arrayThread.length;i++){
            arrayThread[i]= new Thread(new Factorial(i));
            arrayThread[i].start();
        }
    }
}
