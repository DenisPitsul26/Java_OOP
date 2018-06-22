package lesson1.homework.network;

public class Network {

    private static Phone[] Vodafone = new Phone[100];
    private static int count = 0;

    public static boolean registered(Phone phone) {
        if (count >= Vodafone.length) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (Vodafone[i].getNumber().equals(phone.getNumber())) {
                return true;
            }
        }
        Vodafone[count] = phone;
        count++;
        return true;
    }

    public static String call(String number) {
        for (int i = 0; i < count; i++) {
            if (Vodafone[i].getNumber().equals(number)) {
                return "Calling " + Vodafone[i].getNumber();
            }
        }
        return "Number " + number + " is not registered in network.";
    }
}
