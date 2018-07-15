package lesson8.home_work8.stack;

public class Stack {
    private Object[] stack;
    private int lengthStack = 0;
    private BlackList blackList;

    public Stack(int n, BlackList blackList) {
        if (n > 0) {
            stack = new Object[n];
        } else {
            stack = new Object[10];
        }
        this.blackList = blackList;
    }

    public Stack(BlackList blackList) {
        this.blackList = blackList;
        stack = new Object[10];
    }

    public Stack() {
    }

    public int getLengthStack() {
        return lengthStack;
    }

    public BlackList getBlackList() {
        return blackList;
    }

    public void setBlackList(BlackList blackList) {
        this.blackList = blackList;
    }

    private void expandStack() {
        int n = stack.length;
        if (n == 1) {
            n = 2;
        } else {
            n *= 1.5;
        }
        Object[] tempStack = new Object[n];
        System.arraycopy(stack, 0, tempStack, 0, stack.length);
        stack = tempStack;
    }

    public void Push(Object ob) throws IllegalMemberInStackException {
        if (ob == null) {
            throw new IllegalArgumentException("Null reference");
        }
        if (blackList.isInList(ob.getClass())) {
            throw new IllegalMemberInStackException();
        }

        if (lengthStack >= stack.length) {
            expandStack();
        }
        stack[lengthStack] = ob;
        lengthStack++;
    }

    public void Clear() {
        for (int i = 0; i < lengthStack; i++) {
            stack[i] = null;
        }
    }

    public Object Peek() throws StackIsEmptyException {
        if (lengthStack == 0) {
            throw new StackIsEmptyException();
        }
        return stack[lengthStack - 1];
    }

    public Object Pop() throws StackIsEmptyException {
        if (lengthStack == 0) {
            throw new StackIsEmptyException();
        }
        Object temp = stack[lengthStack - 1];
        stack[lengthStack - 1] = null;
        lengthStack--;
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i=0;i<lengthStack;i++){
            str.append((i+1)+": "+stack[i]).append(System.lineSeparator());
        }
        return str.toString();
    }
}
