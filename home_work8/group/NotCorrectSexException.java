package lesson8.home_work8.group;

public class NotCorrectSexException extends Exception {
    @Override
    public String getMessage() {
        return "This value of sex is not correct.";
    }
}
