package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        Map<String, List<Flight>> flights = FlightRepository.getFlightsTable();

        FlightFinder flightFinder = new FlightFinder(flights);

        List<Flight> flightsFromWarsaw = flightFinder.findFlightsFrom("Warszawa");
        System.out.println("Loty z Warszawy:");
        for (Flight flight : flightsFromWarsaw) {
            System.out.println(flight);
        }

    }

    @Test
    public void testFindFlightsFrom2() {
        Map<String, List<Flight>> flights = FlightRepository.getFlightsTable();

        FlightFinder flightFinder = new FlightFinder(flights);

        List<Flight> flightsFromBerlin = flightFinder.findFlightsFrom("Berlin");
        System.out.println("Loty z Berlina:");
        for (Flight flight : flightsFromBerlin) {
            System.out.println(flight);
        }

    }

    @Test
    public void testFindFlightsTo() {
        Map<String, List<Flight>> flights = FlightRepository.getFlightsTable();

        FlightFinder flightFinder = new FlightFinder(flights);

        List<Flight> flightsToGdansk = flightFinder.findFlightsTo("Gdansk");
        System.out.println("Loty do Gdanska: ");
        for ( Flight flight : flightsToGdansk) {
            System.out.println(flight);
        }
    }

    @Test
    public void testFindFlightsTo2() {
        Map<String, List<Flight>> flights = FlightRepository.getFlightsTable();

        FlightFinder flightFinder = new FlightFinder(flights);

        List<Flight> flightsToKrakow = flightFinder.findFlightsTo("Krakow");
        System.out.println("Loty do Krakowa: ");
        for ( Flight flight : flightsToKrakow) {
            System.out.println(flight);
        }
    }
}