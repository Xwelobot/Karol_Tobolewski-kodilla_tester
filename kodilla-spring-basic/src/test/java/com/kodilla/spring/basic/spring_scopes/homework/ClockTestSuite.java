package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldGetFewClocks(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstbean = context.getBean(Clock.class);
        Clock secondbean = context.getBean(Clock.class);
        Clock thirdbean = context.getBean(Clock.class);
        //When
        System.out.println(firstbean);
        System.out.println(secondbean);
        System.out.println(thirdbean);
        //Given
        Assertions.assertNotEquals(firstbean, secondbean);
        Assertions.assertNotEquals(firstbean, thirdbean);
        Assertions.assertNotEquals(thirdbean, secondbean);


    }

}