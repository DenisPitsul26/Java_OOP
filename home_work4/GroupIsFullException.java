package lesson4.home_work4;

public class GroupIsFullException extends Exception {
    @Override
    public String getMessage() {
        return "Error. Group is full.\n";
    }
}
