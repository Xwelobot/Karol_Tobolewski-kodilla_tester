package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("PL nr 1", 0.5, "No"));
        stamps.add(new Stamp("DE nr 1", 0.6, "Yes"));
        stamps.add(new Stamp("GB nr 1", 0.5, "Yes"));
        stamps.add(new Stamp("US nr 1", 0.6, "No"));
        stamps.add(new Stamp("PL nr 1", 0.5, "No"));

        System.out.println("Amount of stamps: " + stamps.size());

        for(Stamp stamp: stamps)
            System.out.println(stamps);

    }
}
