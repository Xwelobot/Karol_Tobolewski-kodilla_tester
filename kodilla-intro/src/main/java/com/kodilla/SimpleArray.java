package com.kodilla;

public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[5];
        movies[0] = "Harry Potter";
        movies[1] = "Lord of the Rings";
        movies[2] = "Forrest Gump";
        movies[3] = "Heretic";
        movies[4] = "Hooligans";

        String movie = movies[4];
        System.out.println(movie);

        int numberOfElements = movies.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementow");
    }
}
