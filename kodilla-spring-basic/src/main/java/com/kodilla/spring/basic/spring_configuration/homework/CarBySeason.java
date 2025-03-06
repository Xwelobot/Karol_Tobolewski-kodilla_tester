package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class CarBySeason {

    @Bean
    public Car getCarBySeason(String season){
        switch (season.toLowerCase()){
            case "winter":
                return new SUV();
            case "summer":
                return new Cabrio();
            case "spring", "autumn":
                return new Sedan();
            default:
                return null;
        }
    }
}
