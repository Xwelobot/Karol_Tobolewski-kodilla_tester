package com.kodilla;

import java.util.Random;

public class RandomNumbers {
    int maxNumber = 15;
    int minNumber = 5;

    int maxGeneratedNumber = 0;
    int minGeneratedNumber = 0;

    public int randomNumbers(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;

        while (sum < max) {
            int temp = random.nextInt(31);
            sum += temp;
            result++;

            if (temp > maxNumber) {
                this.maxGeneratedNumber = temp;
            }
            if (temp < minNumber) {
                this.minGeneratedNumber = temp;
            }
        }
        System.out.println("Najwieksza wylosowana liczba: " + this.maxGeneratedNumber);
        System.out.println("Najmniejsza wylosowana liczba: " + this.minGeneratedNumber);

        return result;
    }

    public int getMaxGeneratedNumber() {
        return this.maxGeneratedNumber;
    }

    public int getMinGeneratedNumber() {
        return this.minGeneratedNumber;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();

        int result = randomNumbers.randomNumbers(5000);

        System.out.println("Liczba potrzebna do przekroczenia sumy 5000: " + result);
    }
}
