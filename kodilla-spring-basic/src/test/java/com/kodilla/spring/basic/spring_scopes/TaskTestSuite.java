package com.kodilla.spring.basic.spring_scopes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskTestSuite {


    @Test
    public void shouldCreateDifferentTasks(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Task firstbean = context.getBean(Task.class);
        Task secondbean = context.getBean(Task.class);
        Task thirdbean = context.getBean(Task.class);
        Assertions.assertNotEquals(firstbean, secondbean);
        Assertions.assertNotEquals(secondbean, thirdbean);
        Assertions.assertNotEquals(thirdbean, firstbean);
    }


}