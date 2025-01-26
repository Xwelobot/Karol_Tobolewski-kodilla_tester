package com.kodilla.collections.homework;

public class BMW implements Car{
    private double speed;
    private String model;

    public BMW(double speed, String name){
        this.speed = speed;
        this.model = name;
    }

//    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public double getSpeed(){
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
