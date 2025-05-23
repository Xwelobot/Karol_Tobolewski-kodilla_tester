package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();

        shapes.add(new Square(10.0));
        shapes.add(new Circle(5.0));
        shapes.add(new Triangle(5.0, 3.0, 4.0));

        for(Shape shape : shapes){
            System.out.println(shape + " Area: " + shape.getArea() + ", perimeter: " + shape.getPerimeter());
        }
    }
}
