package com.kodilla.collections.homework;

public class Mustang implements Car{
    private double speed;
    private String model;

    @Override
    public String toString() {
        return "Mustang{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }

    public Mustang(double speed, String name){
        this.speed = speed;
        this.model = name;
    }

//    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 50;
    }

    @Override
    public void decreaseSpeed() { this.speed -= 35; }
}
