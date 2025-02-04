package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    public static Map<String, List<Flight>> getFlightsTable() {
        Map<String, List<Flight>> flightRepository = new HashMap<>();

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Londyn", "Warszawa"));
        flights.add(new Flight("Warszawa", "Londyn"));
        flights.add(new Flight("Kraków", "Gdansk"));
        flights.add(new Flight("Warszawa", "Berlin"));

        flightRepository.put("Loty", flights);

        return flightRepository;
    }
    public int size(){
        return getFlightsTable().size();
    }
}