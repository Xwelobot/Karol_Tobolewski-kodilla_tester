package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarSetting {


    @Bean
    public CarBySeason carBySeason(){
        return new CarBySeason();

    }

    @Bean
    public Car carSelect(String season){
        CarBySeason carBySeason = carBySeason();
        return carBySeason.getCarBySeason(season);
    }

}
