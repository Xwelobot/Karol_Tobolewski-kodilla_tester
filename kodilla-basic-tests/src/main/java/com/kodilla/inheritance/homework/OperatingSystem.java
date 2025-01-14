package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int win;
    private int mac;

    public OperatingSystem (int win, int mac) {
        this.win = win;
        this.mac = mac;
    }

    public static void turnOn() {
        System.out.println("Turning on");
    }

    public static void turnOff() {
        System.out.println("Turning off");
    }

    public int getWin(){
        return win;
    }

    public int getMac(){
        return mac;
    }

}
