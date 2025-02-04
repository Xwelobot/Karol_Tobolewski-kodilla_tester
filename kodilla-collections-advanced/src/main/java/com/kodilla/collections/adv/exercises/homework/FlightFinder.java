package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {
    Map<String, List<Flight>> flightRepository = new HashMap<>();

    public List<Flight> findFlightsFrom(String departure){
         return flightRepository.getOrDefault(departure, Collections.emptyList());

    }

    public List<Flight> findFlightsTo(String arrival){
        return flightRepository.getOrDefault(arrival, Collections.emptyList());
    }

    public int size(){
        return flightRepository.size();
    }

    public void addFlight(String departure, FlightRepository flightRepository){
//        List<FlightRepository> flightRepositories = flightRepository
    }
}
