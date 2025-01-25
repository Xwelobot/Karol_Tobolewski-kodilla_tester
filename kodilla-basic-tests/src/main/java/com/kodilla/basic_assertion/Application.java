package com.kodilla.basic_assertion;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;

        double sumResult = calculator.sum(a, b);

        boolean correct = assertEquals(13, sumResult);

        if(correct){
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        }   else{
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double substractResult = calculator.substract(a,b);

        boolean correctTwo = assertEquals(-3.0, substractResult);

        if(correctTwo) {
            System.out.println("Metoda poprawnie obliczyla dzialanie odejmowania ktore wynioslo " + substractResult);
        }else {
            System.out.println("Metoda nie wykonala poprawnie odejmowania libcz " + a + " i " + b);
        }

        double squareResult = calculator.square(a);

        boolean correctThree = assertEquals(25, squareResult);

        if(correctThree) {
            System.out.println("Metoda poprawnie obliczyla dzialanie potegowania ktore wynioslo " + squareResult);
        }else {
            System.out.println("Metoda nie poprawnie obliczyla dzialanie potegowania liczby " + a);
        }
    }
}
