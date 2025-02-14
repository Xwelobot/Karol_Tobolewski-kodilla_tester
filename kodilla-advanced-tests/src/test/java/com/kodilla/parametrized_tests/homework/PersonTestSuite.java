package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.Data#provideDataOfPeople")
    public double testGetBMI(double heightInMeters, double weightInKilogram){
        double result = testGetBMI(heightInMeters,weightInKilogram);
        return result;
    }

}