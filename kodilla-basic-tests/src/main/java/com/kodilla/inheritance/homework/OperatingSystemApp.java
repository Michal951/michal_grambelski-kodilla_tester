package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        Windows windows = new Windows(1990);
        windows.turnOn();
        windows.displayYearOfPublishment();
    }
}