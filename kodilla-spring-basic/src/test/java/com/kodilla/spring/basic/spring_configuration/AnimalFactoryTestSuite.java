package com.kodilla.spring.basic.spring_configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnimalFactoryTestSuite {

    @Test
    public void createDog() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Dog dog = context.getBean(Dog.class);
        //When
        String voice = dog.getVoice();;
        //Then
        Assertions.assertEquals("bark bark", voice);
    }

    @Test
    public void shouldCreateDogBeanAndFetchByBeanName() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Dog dog = (Dog) context.getBean("createDog");
        //When
        String voice = dog.getVoice();
        //Then
        Assertions.assertEquals("bark bark", voice);
    }

    @Test
    public void shouldCreateRandomAnimal() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Animal animal = (Animal) context.getBean("randomAnimal");
        //When
        String voice = animal.getVoice();
        System.out.println(voice);
        //Then
        List<String> possibleVoices = Arrays.asList("bark bark", "miau miau", "quack quack");
        Assertions.assertTrue(possibleVoices.contains(voice));
    }
}