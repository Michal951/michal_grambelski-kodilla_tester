package com.kodilla.abstracts.homework;

public class Kolo extends Shape{
    static double PI = 3.14;
public double r;
    @Override
    double Pole() {
        return PI*r;
    }

    @Override
    double Obwod() {
        return 2* PI * r;
    }
}
