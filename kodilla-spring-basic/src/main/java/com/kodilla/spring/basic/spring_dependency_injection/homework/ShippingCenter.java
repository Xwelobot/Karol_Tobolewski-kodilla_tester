package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

    @Qualifier(value = "EmailNotificationService")
    private NotificationService notificationService;

    @Qualifier(value = "InPostDeliveryService")
    private DeliveryService deliveryService;

    public ShippingCenter(NotificationService notificationService, DeliveryService deliveryService) {
    }

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}
