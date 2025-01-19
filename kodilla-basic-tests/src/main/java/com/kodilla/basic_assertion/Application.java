package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if(correct){
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        }   else{
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int substractResult = calculator.substract(a,b);

        boolean correctTwo = ResultChecker.assertEquals(-3, substractResult);

        if(correctTwo) {
            System.out.println("Metoda poprawnie obliczyla dzialanie odejmowania ktore wynioslo " + substractResult);
        }else {
            System.out.println("Metoda nie wykonala poprawnie odejmowania libcz " + a + " i " + b);
        }

        int squareResult = calculator.square(a);

        boolean correctThree = ResultChecker.assertEquals(25, squareResult);

        if(correctThree) {
            System.out.println("Metoda poprawnie obliczyla dzialanie potegowania ktore wynioslo " + squareResult);
        }else {
            System.out.println("Metoda nie poprawnie obliczyla dzialanie potegowania liczby " + a);
        }
    }
}
