package com.kodilla.basic_aseration;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 3;
        int d = 2;

        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        int powResult = calculator.pow(c, d);

        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correc = ResultChecker.assertEquals(-3, subtractResult);

        if (correc) {
            System.out.println("Metoda działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean cor = ResultChecker.assertEquals(9, powResult);

        if (cor) {
            System.out.println("Metoda działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb " + c + " i " + d);
        }
    }
}