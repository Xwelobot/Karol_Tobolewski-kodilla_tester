package com.kodilla.inheritance.homework;

public class RunSystem {
    public static void main(String[] args){

        OperatingSystem windows = new Windows(1997);
        System.out.println("Year of release was " + windows.getYear());
        windows.turnOn();
        windows.turnOff();

        OperatingSystem macio = new MacIo(1992);
        System.out.println("Year of release was " + macio.getYear());
        macio.turnOff();
        macio.turnOn();
    }
}
