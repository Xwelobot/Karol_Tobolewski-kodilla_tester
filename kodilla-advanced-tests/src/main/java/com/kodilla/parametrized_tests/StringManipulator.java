package com.kodilla.parametrized_tests;

public class StringManipulator {

    public String reverseWithLowerCase(String input){
        StringBuilder buldier = new StringBuilder(input);
        return buldier.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }

    public int countNumberOfCommas(String text) {
        int count = text.length() - text.replace(",", "").length();
        return count;
    }
}
