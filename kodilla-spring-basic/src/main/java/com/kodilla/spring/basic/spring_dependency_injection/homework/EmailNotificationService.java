package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService {
    @Override
    public String success(String address) {
        return "Sending package to user with address [" + address + "]";
    }

    @Override
    public String fail(String address) {
        return "Sending package to user with address [" + address + "] failed";
    }
}
