package com.kodilla.mockito.homework;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MonitorServicesTestSuite {

    private MonitorServices monitorServices;
    private User user;
    private Notification notification;

    @BeforeEach
    public void setUp() {
        monitorServices = new MonitorServices();
        user = mock(User.class);
        notification = mock(Notification.class);
    }

    @Test
    public void testAddUser() {
        Long userId = 1L;
        String userName = "Test User";


        monitorServices.addUser(userId, userName);

        assertNotNull(monitorServices.userMap.get(userId));
    }

    @Test
    public void testRegisterUserToLocation() {
        Long userId = 1L;
        String location = "Warsaw";

        monitorServices.addUser(userId, "Test User");

        monitorServices.registerUserToLocation(userId, location);

        verify(user, times(1)).addLocation(location);
    }

    @Test
    public void testSendNotificationToLocation() {
        Long userId = 1L;
        String location = "Warsaw";
        String message = "Test message";

        monitorServices.addUser(userId, "Test User");

        monitorServices.registerUserToLocation(userId, location);

        monitorServices.sendNotificationToLocation(location, notification);

        verify(user, times(1)).receive(notification);
    }

    @Test
    public void testUnsubscribeUserFromLocation() {
        Long userId = 1L;
        String location = "Warsaw";

        monitorServices.addUser(userId, "Test User");

        monitorServices.registerUserToLocation(userId, location);

        monitorServices.unsubscribeUserFromLocation(userId, location);

        verify(user, times(1)).removeLocation(location);
    }

    @Test
    public void testSendNotificationToAll() {
        Long userId = 1L;
        Notification notification = Mockito.mock(Notification.class);

        monitorServices.addUser(userId, "Test User");

        monitorServices.sendNotificationToAll(notification);

        verify(user, times(1)).receive(notification);
    }

    @Test
    public void testRemoveUser() {
        Long userId = 1L;

        monitorServices.addUser(userId, "Test User");

        monitorServices.removeUser(userId);

        assertNull(monitorServices.userMap.get(userId));
    }

    @Test
    public void testRemoveLocation() {
        Long userId = 1L;
        String location = "Warsaw";

        monitorServices.addUser(userId, "Test User");

        monitorServices.registerUserToLocation(userId, location);

        monitorServices.removeLocation(location);

        verify(user, times(0)).removeLocation(location);
    }
}
