package com.kodilla.abstracts.homework;

public class Kwadrat extends Shape {

    public double a;
    @Override
    double Pole() {
        return a*a;
    }

    @Override
    double Obwod() {
        return 4*a;
    }
}
