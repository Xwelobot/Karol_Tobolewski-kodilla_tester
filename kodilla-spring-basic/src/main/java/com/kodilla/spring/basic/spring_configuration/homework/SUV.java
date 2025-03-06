package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

//    private boolean headLightsOn;
//
//    public SUV(boolean headLightsOn){
//        this.headLightsOn = headLightsOn;
//    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
