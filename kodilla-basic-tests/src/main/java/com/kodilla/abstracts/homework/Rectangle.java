package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
        @Override
        double getArea () {
            return a * b;
        }

        @Override
        double getPerimiter () {
            return 2 * a + 2 * b;
        }
}