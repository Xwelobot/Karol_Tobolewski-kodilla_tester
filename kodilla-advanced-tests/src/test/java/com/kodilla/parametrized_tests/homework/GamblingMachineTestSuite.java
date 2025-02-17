package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    private Set<Integer> numbers(String numbersStr) {
        return Set.of(numbersStr.split(","))
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
    }

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources ="/canThereBeMoreNumbersThanSix.csv", numLinesToSkip = 1)
    public void canThereBeMoreNumbersThanSix(int number){
        assertFalse(gamblingMachine.equals(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/isAnyNumberOutOfDeclaredScope.csv", numLinesToSkip = 1)
    public void canNumberBeOutOfScope(int number){
        assertFalse(gamblingMachine.equals(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/canNumberInScopeApply.csv", numLinesToSkip = 1)
    public void canNumberInScopeApply(String userNumbersStr, int expectedWins) throws InvalidNumbersException {

        Set<Integer> number = numbers(userNumbersStr);
        int wins = gamblingMachine.howManyWins(number);
        assertEquals(expectedWins, wins);

    }
}