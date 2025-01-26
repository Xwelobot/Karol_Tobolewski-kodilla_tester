package com.kodilla.collections.arrays.homework;



import com.kodilla.collections.homework.BMW;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Mustang;
import com.kodilla.collections.homework.Opel;

import java.util.Random;

public class CarApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {

        int drawnCarModel = RANDOM.nextInt(3);
        double speedy = getRandomSize();
        if (drawnCarModel == 0)
            return new Opel(speedy, "Opel");
        else if (drawnCarModel == 1)
            return new BMW(speedy, "BMW");
        else {
            return new Mustang(speedy, "Mustang");
        }
    }
    private static int getRandomSize() {
        return RANDOM.nextInt(200+1 - 100) + 100;

    }
}
