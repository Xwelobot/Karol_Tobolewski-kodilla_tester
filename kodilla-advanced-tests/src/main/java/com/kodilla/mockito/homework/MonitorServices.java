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

    public void addUser(Long userId, String userName) {
        User user = new User() {
            private Long id = userId;
            private String name = userName;
            private List<String> locations = new ArrayList<>();

            @Override
            public Long getId() {
                return id;
            }

            @Override
            public String getUserName() {
                return name;
            }

            @Override
            public void addLocation(String location) {
                locations.add(location);
            }

            @Override
            public void removeLocation(String location) {
                locations.remove(location);
            }

            @Override
            public void removeAllLocations() {
                locations.clear();
            }

            @Override
            public List<String> getLocations() {
                return locations;
            }

            @Override
            public void receive(Notification notification) {
                System.out.println("User " + name + " received notification: " + notification.getMessage());
            }
        };

        userMap.put(user, new ArrayList<>());
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
