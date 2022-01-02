package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Car;


public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getCarKind(car));
        System.out.println("Car increase speed:  " + car.getSpeed());
    }

    public static String getCarKind(Car car) {
        if (car instanceof Nissan)
            return "Nissan";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car kind";
    }
}