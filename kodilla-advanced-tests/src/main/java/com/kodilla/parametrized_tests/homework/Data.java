package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Data {

    static Stream<Arguments> provideDataOfPeople(){
        return Stream.of(
                Arguments.of(80.5, 1.77),
                Arguments.of(66.1, 1.50),
                Arguments.of(69.9, 1.66),
                Arguments.of(98.4, 2.00)
        );
    }
}
