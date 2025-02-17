package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Data {

    static Stream<Arguments> provideDataOfPeople(){
        return Stream.of(
                Arguments.of(60.5, 1.77, "Normal (healthy weight)"),
                Arguments.of(100.1, 1.50, "Obese Class III (Very severely obese)"),
                Arguments.of(169.9, 1.66, "Obese Class VI (Hyper Obese)"),
                Arguments.of(98.4, 2.00, "Normal (healthy weight)")
        );
    }
}
