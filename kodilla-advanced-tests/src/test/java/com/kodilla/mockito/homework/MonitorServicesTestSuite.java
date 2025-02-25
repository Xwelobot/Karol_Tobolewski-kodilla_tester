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
    User user1 = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    private Notification notification;

    @BeforeEach
    void setUp() {
        monitorServices = new MonitorServices();
        notification = mock(Notification.class);
        when(notification.getMessage()).thenReturn("Test Notification");
    }

    @Test
    void testUserCanRegisterToLocationAndReceiveNotifications() {
        monitorServices.registerUserToLocation(user1, "New York");

        monitorServices.sendNotificationToLocation("New York", notification);

        verify(user1, times(1)).receive(notification);
        verify(user2, never()).receive(notification);
    }

    @Test
    void testUserCanUnsubscribeFromLocation() {
        monitorServices.registerUserToLocation(user1, "New York");

        monitorServices.unsubscribeUserFromLocation(user1, "New York");

        monitorServices.sendNotificationToLocation("New York", notification);

        verify(user1, never()).receive(notification);
    }

    @Test
    void testUserCanUnsubscribeFromAllLocations() {
        monitorServices.registerUserToLocation(user1, "New York");
        monitorServices.registerUserToLocation(user1, "Los Angeles");

        monitorServices.unsubscribeUserFromAllLocations(user1);

        monitorServices.sendNotificationToLocation("New York", notification);
        monitorServices.sendNotificationToLocation("Los Angeles", notification);

        verify(user1, never()).receive(notification);
    }

    @Test
    void testSendNotificationToAllUsers() {
        monitorServices.registerUserToLocation(user1, "New York");
        monitorServices.registerUserToLocation(user2, "Los Angeles");

        monitorServices.sendNotification(notification);

        verify(user1, times(1)).receive(notification);
        verify(user2, times(1)).receive(notification);
    }

    @Test
    void testRemoveLocation() {
        monitorServices.registerUserToLocation(user1, "New York");
        monitorServices.registerUserToLocation(user2, "New York");

        monitorServices.removeLocation("New York");

        monitorServices.sendNotificationToLocation("New York", notification);

        verify(user1, never()).receive(notification);
        verify(user2, never()).receive(notification);
    }
}
