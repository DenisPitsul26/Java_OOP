package lesson5.home_work5.group;

public class GroupIsFullException extends Exception {
    @Override
    public String getMessage() {
        return "Error. Group is full.\n";
    }
}
