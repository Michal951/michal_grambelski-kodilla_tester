package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public double a;

    public Square(double a) {
        this.a = a;
    }
    @Override
    double getArea() {
        return a * a;
    }

    @Override
    double getPerimiter() {
        return 4 * a;
    }
}
