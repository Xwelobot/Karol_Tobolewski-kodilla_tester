package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Animal dog = new Dog(4);

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

        Animal duck = new Duck(2);
        processor.process(duck);
    }
}
