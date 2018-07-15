package lesson8.home_work8.stack;

public class IllegalMemberInStackException extends Exception {
    @Override
    public String getMessage() {
        return "The class of this object is in the black list";
    }
}
