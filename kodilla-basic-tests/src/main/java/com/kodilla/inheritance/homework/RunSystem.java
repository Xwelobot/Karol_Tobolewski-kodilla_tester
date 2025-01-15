package com.kodilla.inheritance.homework;

public class RunSystem {
    public static void main(String[] args){

        Windows windows = new Windows(1997);
        System.out.println("Year of release was " + windows.getWin());
        windows.turnOn();

        MacIo macio = new MacIo(1991);
        System.out.println("Year of release was " + macio.getMac());
        macio.turnOff();
    }
}
