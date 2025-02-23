package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private Long userId;
    private String userName;
    private List<String> locations = new ArrayList<>();

    public User(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public void addLocation(String location) {
        if (!locations.contains(location)) {
            locations.add(location);
        }
    }

    public void removeLocation(String location) {
        locations.remove(location);
    }

    public void removeAllLocations() {
        locations.clear();
    }

    public List<String> getLocations() {
        return locations;
    }

    public void receive(Notification notification) {
        System.out.println(userName + " received notification: " + notification);
    }
}

