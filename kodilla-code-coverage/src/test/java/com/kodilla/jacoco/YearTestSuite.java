package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTestSuite {

    @Test
    void isLeap() {

        //given
        Year year = new Year(1600);

        //When
        boolean leap = year.isLeap();

        //Then
        assertTrue(leap);
    }
}