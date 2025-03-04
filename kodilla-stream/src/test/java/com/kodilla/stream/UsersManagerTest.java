package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testFilterChemistUsers(){
        List<String> users = new ArrayList<>();
        users.add("Walter White");
        users.add("Gale Boetticher");

        List<String> chemists = UsersManager.filterChemistGroupUsernames();
        assertEquals(users, chemists);
    }

    @Test
    public void testFilterAgeAbove(){
        List<String> users = new ArrayList<>();
        users.add("Walter White");
        users.add("Gus Firing");
        users.add("Mike Ehrmantraut");

        List<String> oldAge = UsersManager.filterAgeOfUsers(44);
        assertEquals(users, oldAge);
    }

    @Test
    public void testFilterPostNumberZero(){
        List<String> users = new ArrayList<>();
        users.add("Gus Firing");
        users.add("Mike Ehrmantraut");

        List<String> post = UsersManager.filterNumberOfPosts();
        assertEquals(users, post);
    }

    @Test
    public void testFilterAgeAbove40(){
        List<String> users = new ArrayList<>();
        users.add("Walter White");
        users.add("Gus Firing");
        users.add("Gale Boetticher");
        users.add("Mike Ehrmantraut");

        List<String> oldAge = UsersManager.filterAgeOfUsers(40);
        assertEquals(users, oldAge);
    }

    @Test
    public void testFilterAgeAbove50(){
        List<String> users = new ArrayList<>();
        users.add("Mike Ehrmantraut");


        List<String> oldAge = UsersManager.filterAgeOfUsers(50);
        assertEquals(users, oldAge);
    }
}
