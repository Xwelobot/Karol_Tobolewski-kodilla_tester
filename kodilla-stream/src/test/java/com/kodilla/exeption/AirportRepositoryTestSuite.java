package com.kodilla.exeption;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTestSuite {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {

        AirportRepository airportRepository = new AirportRepository();

        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");

        assertTrue(isWarsawInUse);
    }

    @Test
    public void testIsAirportInUse_withExeption() {

        AirportRepository airportRepository = new AirportRepository();

        assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Vienna"));
    }

}