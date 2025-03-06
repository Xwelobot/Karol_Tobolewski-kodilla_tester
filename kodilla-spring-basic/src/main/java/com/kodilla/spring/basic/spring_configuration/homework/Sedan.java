package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car{

//    private boolean headLightsOn;
//
//    public Sedan(boolean headLightsOn){
//        this.headLightsOn = headLightsOn;
//    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
