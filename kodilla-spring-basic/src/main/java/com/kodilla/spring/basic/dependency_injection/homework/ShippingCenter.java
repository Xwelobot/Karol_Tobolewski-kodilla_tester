package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    public DeliveryService deliveryService = new DeliveryService();
    private NotificationService notificationService;

    public ShippingCenter (NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
