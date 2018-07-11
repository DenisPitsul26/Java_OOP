package lesson7.home_work7.ships;

public class Logistics implements Runnable {
    private Ship ship;
    private Port port;

    public Logistics(Ship ship, Port port) {
        this.ship = ship;
        this.port = port;
    }

    public Logistics() {
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    @Override
    public void run() {
        port.unloadingShip(ship);
    }
}
