package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class ShippingCenterTest {

    private final InPostDeliveryService inpost = new InPostDeliveryService();

    private final EmailNotificationService email = new EmailNotificationService();
    @Test
    void shouldGetEmailFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        EmailNotificationService bean = context.getBean(EmailNotificationService.class);
        String success = bean.success("ul. Jana Pawla 2");
        Assertions.assertNotNull(success);
    }

    @Test
    void shouldPassDelivery() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        InPostDeliveryService bean = context.getBean(InPostDeliveryService.class);
        boolean send = bean.deliverPackage("ul. Jana Pawla 2", 22);
        assertTrue(send);
    }

    @Test
    void shouldFailDelivery() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        InPostDeliveryService bean = context.getBean(InPostDeliveryService.class);
        boolean send = bean.deliverPackage("ul. Jana Pawla 2", 33);
        assertFalse(send);
    }

    @Test
    void shouldSendSuccessNotificationWhenPackageDelivered() {
        // given
        DeliveryService deliveryService = mock(DeliveryService.class);
        NotificationService notificationService = mock(NotificationService.class);

        when(deliveryService.deliverPackage("NY", 10)).thenReturn(true);

        ShippingCenter shippingCenter = new ShippingCenter(notificationService, deliveryService);

        // when
        shippingCenter.sendPackage("NY", 10);

        // then
        verify(notificationService).success("NY");
        verify(notificationService, never()).fail(anyString());
    }

    @Test
    void shouldSendFailureNotificationWhenPackageNotDelivered() {
        // given
        DeliveryService deliveryService = mock(DeliveryService.class);
        NotificationService notificationService = mock(NotificationService.class);

        when(deliveryService.deliverPackage("LA", 35)).thenReturn(false);

        ShippingCenter shippingCenter = new ShippingCenter(notificationService, deliveryService);

        // when
        shippingCenter.sendPackage("LA", 35);

        // then
        verify(notificationService).fail("LA");
        verify(notificationService, never()).success(anyString());
    }
    @Test
    void shouldDeliverPackageWhenWeightIsBelowLimit() {
        assertTrue(inpost.deliverPackage("Test Street", 29.5));
    }

    @Test
    void shouldNotDeliverPackageWhenWeightIsTooHigh() {
        assertFalse(inpost.deliverPackage("Heavy Street", 31));
    }

    @Test
    void shouldHandleSuccessNotification() {
        email.success("Test Street");
    }

    @Test
    void shouldHandleFailureNotification() {
        email.fail("Fail Street");
    }
}