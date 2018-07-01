package lesson4.home_work4;

public class NotCorrectAgeException extends Exception {
    @Override
    public String getMessage() {
        return "This value of age is not correct.";
    }
}
