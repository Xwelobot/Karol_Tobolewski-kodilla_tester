package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new Book("Diuna", "Frank Herbert");

        BookRecord bookRecord = new BookRecord("Mesjasz Diuny", "Frank Herbert", 1969);

        System.out.println(bookRecord);
    }
}
