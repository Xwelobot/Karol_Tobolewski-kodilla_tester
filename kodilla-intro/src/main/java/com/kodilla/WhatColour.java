package com.kodilla;

public class WhatColour {
    public String getWhatColour() {

        String whatColour = UserDialogs.getWhatColour();

        return switch (whatColour) {
            case "G" -> "Green";
            case "R" -> "Red";
            case "B" -> "Blue";
            case "P" -> "Purple";
            default -> "No such colour";
        };
    }
}

