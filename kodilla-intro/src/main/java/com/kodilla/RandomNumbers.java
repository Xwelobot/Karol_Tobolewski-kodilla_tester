package com.kodilla;

import java.util.Random;

public class RandomNumbers {
    int maxNumber = Integer.MIN_VALUE;
    int minNumber = Integer.MAX_VALUE;
    public int randomNumbers(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;

        private static String RandomNumbers(int maxNumber, int minNumber) {

        }

        while (sum < max) {
            int temp = random.nextInt(31);
            sum += temp;
            result++;

            if (temp > maxNumber) {
                maxNumber = temp;
            }
            if (temp < minNumber) {
                minNumber = temp;
            }
        }
        System.out.println("Najwieksza wylosowana liczba: " + maxNumber);
        System.out.println("Najmniejsza wylosowana liczba: " + minNumber);

        return result;
    }
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        int result = randomNumbers.randomNumbers(5000);
        System.out.println("Liczba potrzebna do przekroczenia sumy 5000: " + result);
    }
}
