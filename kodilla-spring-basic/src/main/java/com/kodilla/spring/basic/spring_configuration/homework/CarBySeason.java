package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalTime;


public class CarBySeason {

    LocalTime currentTime = LocalTime.now();

    LocalTime start = LocalTime.of(6, 0);
    LocalTime end = LocalTime.of(20, 0);


    public Car getCarBySeason(String season){
        switch (season.toLowerCase()){
            case "winter":
                if (currentTime.isBefore(start) || currentTime.isAfter(end)){
                    new SUV(true);
                    return null;
                }
                return new SUV(true);
            case "summer":
                if (currentTime.isBefore(start) || currentTime.isAfter(end)){
                    new Cabrio(true);
                    return null;
                }
                return new Cabrio(true);
            case "spring", "autumn":
                if (currentTime.isBefore(start) || currentTime.isAfter(end)) {
                    new Sedan(true);
                    return null;
                }
                return new Sedan(true);
            default:
                return null;
        }
    }
}
