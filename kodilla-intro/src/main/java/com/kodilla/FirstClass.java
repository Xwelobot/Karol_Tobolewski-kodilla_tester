package com.kodilla;

public class FirstClass {
    public static void main(String[] args) {
                Notebook notebook = new Notebook(600, 1000, 2002);
                System.out.println("Weight " + notebook.weight + " and price " + notebook.price);
                notebook.checkPrice();
                notebook.checkWeight();
                notebook.checkYear();

                Notebook heavyNotebook = new Notebook(2000, 1500, 2010);
                System.out.println("Weight " + heavyNotebook.weight + " and price " + heavyNotebook.price);
                heavyNotebook.checkPrice();
                heavyNotebook.checkWeight();
                heavyNotebook.checkYear();

                Notebook oldNotebook = new Notebook(1600, 500, 2022);
                System.out.println("Weight " + oldNotebook.weight + " and price " + oldNotebook.price);
                oldNotebook.checkPrice();
                oldNotebook.checkWeight();
                oldNotebook.checkYear();
            }
        }

