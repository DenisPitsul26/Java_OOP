package lesson8.home_work8.group;

public class NotCorrectAgeException extends Exception {
    @Override
    public String getMessage() {
        return "This value of age is not correct.";
    }
}
