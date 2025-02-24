package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class MonitorServices {

    Map<User, List<String>> userMap = new HashMap<>();

    public void registerUserToLocation(Long userId, String location) {
        User user = userMap.keySet().stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No user found"));

        List<String> locations = userMap.get(user);
        if (!locations.contains(location)) {
            locations.add(location);
        }
    }

    public void unsubscribeUserFromLocation(Long userId, String location) {
        User user = userMap.keySet().stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst()
                .orElse(null);

        if (user != null) {
            List<String> locations = userMap.get(user);
            locations.remove(location);
        }
    }

    public void unsubscribeUserFromAllLocations(Long userId) {
        User user = userMap.keySet().stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst()
                .orElse(null);

        if (user != null) {
            List<String> locations = userMap.get(user);
            locations.clear();
        }
    }

    public void addUser(User user) {
        this.userMap.put(user, );
    }

    public void sendNotificationToAll(Notification message) {
        for (User user : userMap.keySet()) {
            sendNotification(message);
        }
    }

    public void sendNotificationToLocation(String location, Notification message) {
        for (User user : userMap.keySet()) {
            List<String> locations = userMap.get(user);
            if (locations.contains(location)) {
                sendNotification(message);
            }
        }
    }

    public void sendNotification(Notification notification) {
        this.userMap.forEach((user, locations) -> user.receive(notification));
    }

    public void removeLocation(String location) {
        for (User user : userMap.keySet()) {
            List<String> locations = userMap.get(user);
            locations.remove(location);
        }
    }

    public void removeUser(Long userId) {
        userMap.keySet().removeIf(user -> user.getId().equals(userId));
    }
}
