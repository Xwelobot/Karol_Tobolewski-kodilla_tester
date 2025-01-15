package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(2.2);

        Shape circle = new Circle(4.4);

        Shape rectangle = new Rectangle(2.1,3.7);

        Shape[] shapes = new Shape[3];
        shapes[0] = square;
        shapes[1] = circle;
        shapes[2] = rectangle;

        for(int i = 0; i < 3; i++){
            Shape s = shapes[i];

            System.out.println(s.perimeter());

            System.out.println(s.area());
        }

    }
}
