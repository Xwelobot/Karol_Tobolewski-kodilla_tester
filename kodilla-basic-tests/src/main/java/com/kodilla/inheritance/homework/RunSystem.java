package com.kodilla.inheritance.homework;

public class RunSystem {
    public static void main(String[] args){

        Windows windows = new Windows(1997, 0);
        System.out.println(windows.getWin());
        windows.turnOn();

        MacIo macio = new MacIo(0, 1991);
        System.out.println(macio.getMac());
        MacIo.turnOff();

    }
}
