package com.kodilla.collections.interfaces.homework;

public class Mustang implements Car{
    private int speed;
    private String model;


    public Mustang(int speed, String name){
        this.speed = speed;
        this.model = name;
    }

//    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 50;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 35;

    }
}
