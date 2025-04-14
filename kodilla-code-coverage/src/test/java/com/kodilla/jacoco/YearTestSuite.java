package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTestSuite {

    @Test
    void isLeapTrue() {

        //given
        Year year = new Year(1600);

        //When
        boolean leap = year.isLeap();

        //Then
        assertTrue(leap);
    }
    @Test
    void isLeapFalse() {

        //given
        Year year = new Year(1630);

        //When
        boolean leap = year.isLeap();

        //Then
        assertFalse(leap);
    }

    @Test
    void isLeapFalseAgain() {

        //given
        Year year = new Year(1000);

        //When
        boolean leap = year.isLeap();

        //Then
        assertFalse(leap);
    }

    @Test
    void isLeapFalseAgainAgain() {

        //given
        Year year = new Year(1004);

        //When
        boolean leap = year.isLeap();

        //Then
        assertTrue(leap);
    }
}