package com.kodilla;

public class GradesMain {
    public static void main(String[] args) {
        Grades studentGrade = new Grades();
        studentGrade.add(4);
        studentGrade.add(5);
        studentGrade.add(3);
        studentGrade.add(4);
        studentGrade.add(3);
        studentGrade.add(6);
        studentGrade.add(3);
        studentGrade.add(6);
        studentGrade.add(3);
        studentGrade.add(6);
        studentGrade.add(3);

        int lastGrade = studentGrade.getLastGrade();
        System.out.println(lastGrade);
        double averageGrade = studentGrade.getAverageGrade();
        System.out.println(averageGrade);
    }
}
