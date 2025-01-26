package com.kodilla.collections.homework;

public class Opel implements Car{
    private int speed;
    private String model;

    public String getModel(){
        return this.model;
    }

    public Opel(int speed, String name){
        this.speed = speed;
        this.model = name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 35;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 25;
    }
}
