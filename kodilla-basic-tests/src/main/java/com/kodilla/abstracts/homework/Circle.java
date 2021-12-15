package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    public double r;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    double getArea() {
        return Math.PI * r * r;
    }

    @Override
    double getPerimiter() {
        return 2 * Math.PI * r;
    }
}