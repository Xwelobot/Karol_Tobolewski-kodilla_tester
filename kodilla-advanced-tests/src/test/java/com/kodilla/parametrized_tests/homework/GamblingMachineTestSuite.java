package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

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
    @CsvFileSource(resources = "/canNumberInScopeApply.csv",delimiter = ':', numLinesToSkip = 1)
    public void canNumberInScopeApply(Set<Integer> numbers, int ExpectedWin ) throws InvalidNumbersException {

        int result = gamblingMachine.howManyWins(numbers);
        assertEquals(ExpectedWin, result);
    }
}