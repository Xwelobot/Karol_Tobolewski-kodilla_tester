package com.kodilla.collections.homework;

public class Opel implements Car{
    private double speed;
    private String model;

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }

    public String getModel(){
        return this.model;
    }

    public Opel(double speed, String name){
        this.speed = speed;
        this.model = name;
    }

    @Override
    public double getSpeed() {
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

