package lesson8.home_work8.group;

public class GroupIsFullException extends Exception {
    @Override
    public String getMessage() {
        return "Error. Group is full.\n";
    }
}
