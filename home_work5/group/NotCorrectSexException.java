package lesson5.home_work5.group;

public class NotCorrectSexException extends Exception {
    @Override
    public String getMessage() {
        return "This value of sex is not correct.";
    }
}
