package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class MonitorServices {

    Map<User, List<String>> userMap = new HashMap<>();

    public void registerUserToLocation(User user, String location) {
        List<String> locations = userMap.getOrDefault(user, new ArrayList<>());
        if (!locations.contains(location)) {
            locations.add(location);
            userMap.put(user, locations);
        }
    }

    public void unsubscribeUserFromLocation(User user, String location) {
        if (user != null) {
            List<String> locations = userMap.getOrDefault(user, new ArrayList<>());
            locations.remove(location);
            userMap.put(user, locations);
        }
    }

    public void unsubscribeUserFromAllLocations(User user) {
            if (user != null) {
            List<String> locations = userMap.getOrDefault(user, new ArrayList<>());
            locations.clear();
            userMap.put(user, locations);
        }
    }

    public void sendNotificationToLocation(String location, Notification message) {
        this.userMap.forEach((user, locations) -> {
            if (locations.contains(location)){
                user.receive(message);
            }
        });
    }

    public void sendNotification(Notification notification) {
        this.userMap.forEach((user, locations) -> user.receive(notification));
    }

    public void removeLocation(String location) {
        for (User user : userMap.keySet()) {
            List<String> locations = userMap.getOrDefault(user, new ArrayList<>());
            locations.remove(location);
            userMap.put(user, locations);
        }
    }
}
