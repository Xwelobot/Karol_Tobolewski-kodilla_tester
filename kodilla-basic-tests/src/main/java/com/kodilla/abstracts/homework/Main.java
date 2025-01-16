package com.kodilla.abstracts.homework;

public class Main {
    public static void main(String[] args) {

        Person jan = new Person("Jan", 28, new Trainer());
        System.out.println(jan.Responsibilities());

        Person michal = new Person("Michal", 33, new Manager());
        System.out.println(michal.Responsibilities());
    }
}
