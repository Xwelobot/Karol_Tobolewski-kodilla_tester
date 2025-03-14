package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class CarSetting {

    LocalTime currentTime = LocalTime.now();

    LocalTime start = LocalTime.of(6, 0);
    LocalTime end = LocalTime.of(20, 0);


    public CarBySeason carBySeason(){
        return new CarBySeason();

    }

    @Bean
    public String season(){
        return "summer";
    }

    @Bean
    public Car carSelect(String season){
        CarBySeason carBySeason = carBySeason();
        return carBySeason.getCarBySeason(season);
    }



}
