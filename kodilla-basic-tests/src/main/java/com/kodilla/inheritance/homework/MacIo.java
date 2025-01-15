package com.kodilla.inheritance.homework;

public class MacIo extends OperatingSystem {

    public MacIo(int year){
        super(year);
    }

    public void turnOff(){
        System.out.println("trying to  turn off...");
    }

    public void turnOn() {
        System.out.println("Turned on!");
    }
}
