package com.kodilla.mockito.homework;

import com.kodilla.mockito.homework.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class MonitorServicesTest {

    private MonitorServices monitorServices;
//    private User user1 = Mockito.mock(User.class);
//    private User user2 = Mockito.mock(User.class);
    private Notification notification;

    @BeforeEach
    void setUp() {
        monitorServices = new MonitorServices();

        monitorServices.addUser(1L, "John");
        monitorServices.addUser(2L, "Jane");

        notification = mock(Notification.class);
        when(notification.getMessage()).thenReturn("Test Notification");
    }

    @Test
    void testUserCanRegisterToLocationAndReceiveNotifications() {
        monitorServices.registerUserToLocation(1L, "New York");

        monitorServices.sendNotificationToLocation("New York", notification);

        verify(monitorServices, times(1)).sendNotification(notification);
        verify(monitorServices, never()).sendNotification(notification);
    }

    @Test
    void testUserCanUnsubscribeFromLocation() {
        monitorServices.registerUserToLocation(1L, "New York");

        monitorServices.unsubscribeUserFromLocation(1L, "New York");

        monitorServices.sendNotificationToLocation("New York", notification);

        verify(monitorServices, never()).sendNotification(notification);
    }

    @Test
    void testUserCanUnsubscribeFromAllLocations() {
        monitorServices.registerUserToLocation(1L, "New York");
        monitorServices.registerUserToLocation(1L, "Los Angeles");

        monitorServices.unsubscribeUserFromAllLocations(1L);

        monitorServices.sendNotificationToLocation("New York", notification);
        monitorServices.sendNotificationToLocation("Los Angeles", notification);

        verify(monitorServices, never()).sendNotification(notification);
    }

    @Test
    void testSendNotificationToLocation() {
        monitorServices.registerUserToLocation(1L, "New York");
        monitorServices.registerUserToLocation(2L, "Los Angeles");

        monitorServices.sendNotificationToLocation("New York", notification);

        verify(monitorServices, times(1)).sendNotification(notification);
        verify(monitorServices, never()).sendNotification(notification);
    }

    @Test
    void testSendNotificationToAllUsers() {
        monitorServices.sendNotificationToAll(notification);

        verify(monitorServices, times(1)).sendNotificationToAll(notification);
    }

    @Test
    void testRemoveLocation() {
        monitorServices.registerUserToLocation(1L, "New York");
        monitorServices.registerUserToLocation(2L, "New York");

        monitorServices.removeLocation("New York");

        monitorServices.sendNotificationToLocation("New York", notification);

        verify(monitorServices, never()).sendNotification(notification);
    }
}
