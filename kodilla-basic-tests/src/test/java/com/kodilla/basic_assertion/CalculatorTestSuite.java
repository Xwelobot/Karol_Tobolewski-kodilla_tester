package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        double a = 5.6;
        double b = 5.8;

        double sumResult = calculator.sum(a, b);
        assertEquals(11.4, sumResult, 0.1);
        System.out.println(sumResult);
    }
    @Test
    public void testSubstract() {
        double a = 5.6;
        double b = 5.8;

        double substractResult = calculator.substract(a,b);
        assertEquals(-0.2, substractResult, 0.1);
        System.out.println(substractResult);
    }
    @Test
    public void testSquare() {
        double a = 3.5;

        double squareResult = calculator.square(a);
        assertEquals(12.25, squareResult, 0.1);
    }
    @Test
    public void testSquareZero() {
        double a = 0;

        double squareResultZero = calculator.square(a);
        assertEquals(0, squareResultZero, 0);
    }
    @Test
    public void testSquareMinusZero() {
        double a = -2;

        double squareResultMinusZero = calculator.square(a);
        assertEquals(4, squareResultMinusZero, 0.1);

        System.out.println(squareResultMinusZero);
    }
}
