package lesson8.home_work8.stack;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Integer integerNumber = 3;
        String str = "Bla - bla - bla";
        Double doubleNumber = 3.4;

        BlackList blackList = new BlackList(1);
        blackList.addClassInList(integerNumber.getClass());

        Stack myStack = new Stack(5,blackList);


        try {
            myStack.Push(str);
            myStack.Push(doubleNumber);
            myStack.Push(integerNumber);
        } catch (IllegalMemberInStackException e) {
            System.out.println(e);
        }

        for (int i=0;i<100;i++){
            try {
                myStack.Push("This is "+i+" element.");
            } catch (IllegalMemberInStackException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\t***");
        System.out.println(myStack);

        for (int i=0;i<10;i++){
            try {
                myStack.Pop();
            } catch (StackIsEmptyException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\t***");
        System.out.println(myStack);
        String testStr=null;
        try {
            testStr =(String) myStack.Peek();
        } catch (StackIsEmptyException e) {
            e.printStackTrace();
        }

        System.out.println("\t***");
        System.out.println(testStr);

        myStack.Clear();
        System.out.println("\t***");
        System.out.println(myStack);

        myStack.getBlackList().removeClassInList(integerNumber.getClass());
        try {
            myStack.Push(integerNumber);
            System.out.println(myStack.Peek());
        } catch (IllegalMemberInStackException e) {
            System.out.println(e);
        } catch (StackIsEmptyException e) {
            System.out.println(e);
        }

    }
}
