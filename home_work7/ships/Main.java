package lesson7.home_work7.ships;

public class Main {
    public static void main(String[] args) {
        Port odessa = new Port("Odessa");
        Dock dockOne = new Dock();
        Dock dockTwo = new Dock();
        Ship beda = new Ship("Beda",10);
        Ship titanic = new Ship("Titanic",10);
        Ship varangian = new Ship("Varangian",10);


        odessa.addDock(dockOne);
        odessa.addDock(dockTwo);

        Logistics logOne = new Logistics(beda,odessa);
        Logistics logTwo = new Logistics(titanic,odessa);
        Logistics logThree = new Logistics(varangian,odessa);

        Thread thOne = new Thread(logOne);
        Thread thTwo = new Thread(logTwo);
        Thread thThree = new Thread(logThree);
//        thThree.setPriority(8);

        thOne.start();
        thTwo.start();
        thThree.start();

    }
}
