package lesson1.homework.network;

public class Main {
    public static void main(String[] args) {
        Phone homePhone = new Phone("Dhdsvs-5651","Nokia","black","0501234567");
        Phone workPhone = new Phone("We-889s-dA","LG","White","0504445556");
        Phone iPhone = new Phone ("---","IPhone","Grey","000");

        homePhone.registered();
        workPhone.registered();

        workPhone.call("0501234567");
        workPhone.call("000");
        iPhone.call(workPhone.getNumber());

    }
}
