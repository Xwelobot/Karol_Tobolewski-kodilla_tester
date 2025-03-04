package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldSubstract(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.substract(11, 10);
        assertEquals(1,value);
    }

    @Test
    public void shouldAdd(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.add(11, 10);
        assertEquals(21,value);
    }

    @Test
    public void shouldMuliplie(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.multiply(2, 10);
        assertEquals(20,value);
    }

    @Test
    public void shouldDivide(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.divide(10, 10);
        assertEquals(1,value);
    }

}