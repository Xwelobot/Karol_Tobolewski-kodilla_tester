package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationService();
        DeliveryService deliveryService = new InPostDeliveryService();
        ShippingCenter shippingCenter = new ShippingCenter(notificationService, deliveryService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}
