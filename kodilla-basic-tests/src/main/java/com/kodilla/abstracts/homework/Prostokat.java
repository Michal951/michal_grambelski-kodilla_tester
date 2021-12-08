package com.kodilla.abstracts.homework;

public class Prostokat extends Shape{
    public double a,b;
    @Override
    double Pole() {
        return a*b;
    }

    @Override
    double Obwod() {
        return 2*a + 2*b;
    }
}
