package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal jan = new Principal("Jan Kowalski");
        Principal pawel = new Principal("Pawel Nowak");

        School janSchool = new School("LO nr 1", Arrays.asList(19.0, 23.0, 22.0));
        School pawelSchool = new School("LO nr 2", Arrays.asList(20.0, 23.0, 24.0));

        school.put(jan, janSchool);
        school.put(pawel, pawelSchool);

       for (Map.Entry<Principal, School> principalEntry : school.entrySet()){
           System.out.println("Principal: " + principalEntry.getKey().getPrincipalName() + " students in school: " + principalEntry.getValue().getAll());
       }
    }
}
