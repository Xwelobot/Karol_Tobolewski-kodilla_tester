package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @NullSource
    public void doesNullReturnErrorUsername(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"karol_t@", "kar$", "Ta.?", "tob<l-"})
    public void doesUsernameCanHaveOtherSigns(String username){
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ka", "a", ""})
    public void canUsernameBeShorterThanThree(String username){
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullSource
    public void doesNullReturnErrorEmail(String email){
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"kar@ga!.com", "Kar@gy??.pl", "kar@ad#.c0m"})
    public void canEmailHaveSignsAtEnd(String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"kar@aaaaaaA", "kar@"})
    public void canEmailHaveNoDomain(String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"kargmail.com", "karwp.pl"})
    public void canEmailhaveNoMonke(String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"kar@gmail.eu.com", "kar@wp.domain.pl"})
    public void canEmailhaveSubDomain(String email){
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ka!!r@gmail.com", "k$a,r@wp.pl"})
    public void canEmailhaveOtherSigns(String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

}