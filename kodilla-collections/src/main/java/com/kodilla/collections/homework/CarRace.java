package com.kodilla.collections.homework;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel(150, "Opel");
        doRace(opel);

        Mustang mustang = new Mustang(200, "Mustang");
        doRace(mustang);

        BMW bmw = new BMW(180, "BMW");
        doRace(bmw);
    }

    public static void doRace(Car Car){
        System.out.println(Car.getSpeed() + " " + Car.getModel());
        Car.increaseSpeed();
        Car.increaseSpeed();
        Car.increaseSpeed();
        Car.decreaseSpeed();
        Car.decreaseSpeed();
        System.out.println(Car.getSpeed() + " " + Car.getModel());

    }
}
