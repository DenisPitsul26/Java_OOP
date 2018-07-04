package lesson5.home_work5.group;

public class NotCorrectAgeException extends Exception {
    @Override
    public String getMessage() {
        return "This value of age is not correct.";
    }
}
