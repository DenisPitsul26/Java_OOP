package lesson8.home_work8.stack;

public class StackIsEmptyException extends Exception {
    @Override
    public String getMessage() {
        return "Stack is empty";
    }
}
