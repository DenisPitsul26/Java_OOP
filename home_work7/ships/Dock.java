package lesson7.home_work7.ships;

public class Dock {
    private int number;
    private String namePort;
    private boolean locked;

    public Dock() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNamePort() {
        return namePort;
    }

    public void setNamePort(String namePort) {
        this.namePort = namePort;
    }

    public boolean isLocked() {
        return locked;
    }

    public synchronized void unloadingShip(Ship ship){
        if (!ship.isFull()){
            return;
        }
        locked = true;
        while (ship.isFull()){
            ship.setCountBox(ship.getCountBox()-1);
            System.out.println("Ship: "+ship.getName()+", dock number: "+number+", Number of boxes on board: "+ ship.getCountBox());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        locked = false;
    }
}
