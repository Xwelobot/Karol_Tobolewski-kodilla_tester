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
                if (currentTime.isBefore(start) || currentTime.isAfter(end)) {
                    new SUV(true);
                } else {
                    new SUV(false);
                }
            case "summer":
                if (currentTime.isBefore(start) || currentTime.isAfter(end)){
                    new Cabrio(true);
                } else {
                    new Cabrio(false);
                }
            case "spring", "autumn":
                if (currentTime.isBefore(start) || currentTime.isAfter(end)) {
                    new Sedan(true);
                } else {
                    new Sedan(false);
                }
            default:
                return null;
        }
    }
}
