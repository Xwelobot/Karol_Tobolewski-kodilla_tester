package com.kodilla;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2025));
        System.out.println(isLeapYear(2022));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
    }
}


