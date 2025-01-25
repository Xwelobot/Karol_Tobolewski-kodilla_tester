package com.kodilla.basic_assertion;

public class PrimeChecker {

    private static int count;

    public boolean isPrime(int number) {
        if (number > 1  &&  number % 2 !=0  || number == 2) {
            return true;
        }
        return false;
    }
    public int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count++;
    }
}
