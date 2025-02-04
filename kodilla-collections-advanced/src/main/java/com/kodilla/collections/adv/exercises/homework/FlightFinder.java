package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {
    private Map<String, List<Flight>> flights;

    public FlightFinder(Map<String, List<Flight>> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();

        for (List<Flight> flightsList : flights.values()) {
            for (Flight flight : flightsList) {
                if (flight.getDeparture().equals(departure)) {
                    result.add(flight);
                }
            }
        }
        return result;

    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> result = new ArrayList<>();

        for(List<Flight> flightList : flights.values()){
            for ( Flight flight : flightList) {
                if ( flight.getArrival().equals(arrival)) {
                    result.add(flight);
                }
            }
        }
        return result;
    }

}
