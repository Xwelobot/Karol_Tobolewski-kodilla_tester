package com.kodilla.abstracts.homework;

public class Main {
    public static void main(String[] args) {

        Person jan = new Person("Jan", 28, new Developer());
        System.out.println(jan.displayJobInfo());
    }
}
