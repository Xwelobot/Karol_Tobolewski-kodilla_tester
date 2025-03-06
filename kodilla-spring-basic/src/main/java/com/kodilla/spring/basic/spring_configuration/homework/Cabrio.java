package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car{

//    private boolean headLightsOn;
//
//    public Cabrio(boolean headLightsOn){
//        this.headLightsOn = headLightsOn;
//    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
