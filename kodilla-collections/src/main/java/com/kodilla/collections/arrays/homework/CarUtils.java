package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.homework.BMW;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Mustang;
import com.kodilla.collections.homework.Opel;


public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car model: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
//        System.out.println("Car increased speed: " + car.increaseSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof BMW)
            return "BMW";
        else if (car instanceof Mustang)
            return "Mustang";
        else
            return "Unknown car name";
    }
}
