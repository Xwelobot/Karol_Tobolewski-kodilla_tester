package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private double a;

    public Square(double a){
        this.a = a;
    }

    @Override
    public double perimeter() {
        return 4*a;
    }

    @Override
    public double area() {
        return a*a;
    }
}

