package lesson3.home_work3;

public class GroupIsFullException extends Exception {
    @Override
    public String getMessage() {
        return "Error. Group is full.\n";
    }
}
