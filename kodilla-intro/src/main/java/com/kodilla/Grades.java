package com.kodilla;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            System.out.println("Tablica jest pełna. Nie można dodać więcej ocen.");
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        if (size > 0) {
            return grades[size - 1];
        } else {
            System.out.println("Nie ma zadnych ocen.");
            return -1;
        }
    }
    public double getAverageGrade () {
            if (size == 0) {
                System.out.println("Brak ocen.");
                return 0.0;
            }

            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += grades[i];
            }
            return (double) sum / size;
    }
}
