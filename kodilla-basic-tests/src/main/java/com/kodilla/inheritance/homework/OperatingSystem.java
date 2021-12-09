package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }


    public void turnOn() {
        System.out.println("Welcome");

    }

    public void turnOff() {
        System.out.println("Goodbye");
    }

    public int yearOfPublishment() {
        return year;
    }

    public void displayYearOfPublishment() {
        System.out.println("Year of publishment: " + year);
    }
}