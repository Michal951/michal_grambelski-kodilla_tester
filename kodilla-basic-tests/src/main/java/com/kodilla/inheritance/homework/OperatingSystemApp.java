package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        Windows windows = new Windows(1990);
        windows.turnOn();
        windows.displayYearOfPublishment();

        Linux linux = new Linux(1991);
        linux.turnOn();
        linux.displayYearOfPublishment();
    }
}