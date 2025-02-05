package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {
    private List<Flight> flights;

    public FlightFinder(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();

//        for (List<Flight> flightsList : flights) {
            for (Flight flight : flights) {
                if (flight.getDeparture().equals(departure)) {
                    result.add(flight);
                }
            }
//        }
        return result;

    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> result = new ArrayList<>();

//        for(Flight flightList : flights){
            for ( Flight flight : flights) {
                if ( flight.getArrival().equals(arrival)) {
                    result.add(flight);
                }
            }
//        }
        return result;
    }

}
