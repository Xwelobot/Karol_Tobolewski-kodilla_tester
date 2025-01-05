package com.kodilla;

public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Karol";
        names[1] = "Kacper";
        names[2] = "Kamil";
        names[3] = "Michal";
        names[4] = "Mikolaj";
        String name = names[2];
        System.out.println(names[2]);
    }
}