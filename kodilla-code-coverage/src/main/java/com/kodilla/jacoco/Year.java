package com.kodilla.jacoco;

public class Year {
    int years;

    public Year(int year) {
        this.years = year;
    }

    public boolean isLeap() {
        return (this.years % 4 == 0 && (this.years % 100 != 0 || this.years % 400 == 0));
    }
}
