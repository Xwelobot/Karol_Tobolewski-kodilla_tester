package com.kodilla.collections.lists.homework;

import com.kodilla.collections.homework.BMW;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Mustang;
import com.kodilla.collections.homework.Opel;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Opel(190, "Astra"));
        cars.add(new BMW(200, "e37"));
        cars.add(new Mustang(220, "A21"));
        Opel opel = new Opel(210, "Zafira");
        cars.add(opel);

        cars.remove(1);
        cars.remove(opel);

        System.out.println("Cars in garage: " + cars.size());

        for(Car describleCar : cars)
            System.out.println(describleCar);
    }
}
