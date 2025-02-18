package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();


    @ParameterizedTest
    @CsvFileSource(resources = "/canNumberInScopeApply.csv")
    public void canNumberInScopeApply(String input) throws InvalidNumbersException {
        Set<Integer> numbers = Arrays.stream(input.split(";"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        System.out.println(input);
        System.out.println(numbers);
        assertTrue(gamblingMachine.howManyWins(numbers)>=0);

    }
    @ParameterizedTest
    @CsvFileSource(resources = "/canBeFewerNumbers.csv")
    public void canBeFewerNumbers(String input) throws InvalidNumbersException {
        Set<Integer> numbers = Arrays.stream(input.split(";"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> {
            new GamblingMachine().howManyWins(numbers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/canBeNumberOutOfScope.csv")
    public void canBeNumberOutOfScope(String input) throws InvalidNumbersException {
        Set<Integer> numbers = Arrays.stream(input.split(";"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> {
            new GamblingMachine().howManyWins(numbers);
        });
    }
}