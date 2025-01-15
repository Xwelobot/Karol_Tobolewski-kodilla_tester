package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int year){
        super(year);
    }

    public void turnOn() {
        System.out.println("trying to turn on...");
    }
}
