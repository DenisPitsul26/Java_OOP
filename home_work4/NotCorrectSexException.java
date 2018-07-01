package lesson4.home_work4;

public class NotCorrectSexException extends Exception {
    @Override
    public String getMessage() {
        return "This value of sex is not correct.";
    }
}
