package com.kodilla.collections.homework;

public class BMW implements Car{
    private int speed;
    private String model;

    public BMW(int speed, String name){
        this.speed = speed;
        this.model = name;
    }

//    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getSpeed(){
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 40;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 20;
    }
}
