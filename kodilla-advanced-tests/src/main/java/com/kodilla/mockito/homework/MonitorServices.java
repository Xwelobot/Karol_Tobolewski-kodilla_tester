package com.kodilla.mockito.homework;

import com.kodilla.mockito.homework.Notification;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class MonitorServices {

    Map<Long, User> userMap = new HashMap<>();

    public void registerUserToLocation(Long userId, String location) {
        User user = userMap.get(userId);
        if (user == null) {
            throw new IllegalArgumentException("No user found");
        }

        if (!user.getLocations().contains(location)) {
            user.addLocation(location);
        }
    }

    public void unsubscribeUserFromLocation(Long userId, String location) {
        User user = userMap.get(userId);
        if (user != null) {
            user.removeLocation(location);
        }
    }

    public void unsubscribeUserFromAllLocations(Long userId) {
        User user = userMap.get(userId);
        if (user != null) {
            user.removeAllLocations();
        }
    }

    public void addUser(Long userId, String userName) {
        userMap.put(userId, new User(userId, userName));
    }

    public void sendNotificationToAll(Notification message) {
        for (User user : userMap.values()) {
            sendNotification(message);
        }
    }

    public void sendNotificationToLocation(String location, Notification message) {
        for (User user : userMap.values()) {
            if (user.getLocations().contains(location)) {
                sendNotification(message);
            }
        }
    }

    public void sendNotification(Notification notification) {
        this.userMap.forEach((userId, user) -> user.receive(notification));
    }

    public void removeLocation(String location) {
        for (User user : userMap.values()) {
            user.removeLocation(location);
        }
    }

    public void removeUser(Long userId) {
        this.userMap.remove(userId);
    }
}
