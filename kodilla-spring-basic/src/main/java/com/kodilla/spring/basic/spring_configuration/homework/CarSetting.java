package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarSetting {


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
