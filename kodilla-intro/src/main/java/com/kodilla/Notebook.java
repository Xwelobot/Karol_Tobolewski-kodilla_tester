package com.kodilla;

public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook (int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("This price is good.");
        } else if (this.price >= 1000) {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 700 && this.weight < 1600) {
            System.out.println("This notebook is a little heavy.");
        } else if (this.weight >= 1600) {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYear() {
        if (this.year < 2005) {
            System.out.println("This notebook is old.");
        } else if (this.year > 2005 && this.year < 2020) {
            System.out.println("This notebook is not so old.");
        } else if (this.year >= 2020) {
            System.out.println("This notebook is new.");
        }
    }
}

