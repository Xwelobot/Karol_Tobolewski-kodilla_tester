package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract() {
        double a = 10.3;
        double b = 5.4;

        double substractResult = calculator.substract(a,b);
        assertEquals(4.9, substractResult, 0.1);
    }
    @Test
    public void testSquare() {
        double a = 3.5;

        double squareResult = calculator.square(a);
        assertEquals(12.25, squareResult, 0.1);
    }
}
