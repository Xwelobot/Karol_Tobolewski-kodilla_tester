package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {

    private StringValidator validator = new StringValidator();

    @Test
    public void shouldReturnWithSpaceOnlyTest() {
        assertTrue(validator.isBlank(" "));
    }

    @Test
    public void shouldReturnWithTextTest() {
        assertFalse(validator.isBlank("A"));
    }

    @Test
    public void shouldReturnNullTest(){
        assertTrue(validator.isBlank(null));
    }

    @Test
    public void shouldReturnEmptyTest() {
        assertTrue(validator.isBlank(""));
    }

}