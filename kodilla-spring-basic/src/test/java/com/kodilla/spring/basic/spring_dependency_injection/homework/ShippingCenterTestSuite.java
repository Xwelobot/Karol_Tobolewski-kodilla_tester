package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

//    private NotificationService notificationService;
//
//    @Test
//    public void packageSendSuccessful() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
//        ShippingCenter bean = context.getBean(ShippingCenter.class);
//        String send = bean.sendPackage("ul. Jana Pawla 2", 22);
//        Assertions.assertEquals("Sending package to user with address [ul. Jana Pawla 2] with weight: 22", send);
//    }

    @Test
    public void shouldGetEmailFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        EmailNotificationService bean = context.getBean(EmailNotificationService.class);
        String success = bean.success("ul. Jana Pawla 2");
        Assertions.assertNotNull(success);
    }

    @Test
    public void shouldPassDelivery() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        InPostDeliveryService bean = context.getBean(InPostDeliveryService.class);
        boolean send = bean.deliverPackage("ul. Jana Pawla 2", 22);
        assertTrue(send);
    }

    @Test
    public void shouldFailDelivery() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        InPostDeliveryService bean = context.getBean(InPostDeliveryService.class);
        boolean send = bean.deliverPackage("ul. Jana Pawla 2", 33);
        assertFalse(send);
    }
}