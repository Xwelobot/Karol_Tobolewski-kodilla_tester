package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.Data#provideDataOfPeople")
    public void shouldGetBMIResult(double a, double b, String expected){
        Person person = new Person(b, a);
        String result = person.getBMI();

        assertEquals(expected, result);
    }

}