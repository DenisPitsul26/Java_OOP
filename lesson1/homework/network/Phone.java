package lesson1.homework.network;

import jdk.nashorn.internal.objects.NativeError;
import sun.nio.ch.Net;

import java.sql.SQLOutput;

public class Phone {
    private String imei;
    private String brand;
    private String color;
    private String number;
    private boolean registered;

    public Phone(String imei, String brand, String color, String number) {
        this.imei = imei;
        this.brand = brand;
        this.color = color;
        this.number = number;
    }

    public String getImei() {
        return imei;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void registered(){
        if( Network.registered(this)){
            System.out.println(this.number+" is registered.");
            registered=true;
        } else{
            System.out.println("Error! "+this.number+" is not registered.");
        }
    }
    public void call(String number){
        if (registered) {
            System.out.println(Network.call(number));
        } else {
            System.out.println("You can't call. Register, please.");
        }
    }
}
