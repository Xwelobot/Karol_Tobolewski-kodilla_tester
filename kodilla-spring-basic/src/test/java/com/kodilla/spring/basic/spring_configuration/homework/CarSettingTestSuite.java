package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarSettingTestSuite {

    @Test
    public void shouldGetCabrio(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean(Car.class);
        //When
        String result = car.getCarType();
        System.out.println(result);
        //Then
        assertEquals("Cabrio", result);

    }

    @Test
    public void shouldHaveLightsOn(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean(Car.class);
        //When
        boolean result = car.hasHeadlightsTurnedOn();
        //Then
        assertTrue(result);
    }
}