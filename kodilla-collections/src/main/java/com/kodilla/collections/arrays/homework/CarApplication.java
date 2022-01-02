package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

public class CarApplication {

    private static Object Car;

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int c = 0; c < cars.length; c++)
            cars[c] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCar = random.nextInt(3);
        int a = (int) random.nextInt(76);
        int b = (int) random.nextInt(55);
        int c = (int) random.nextInt(97);

        if (drawnCar == 0)
            return new Opel(a);
        else if (drawnCar == 1)
            return new Ford(b);
        else
            return new Nissan(c);
    }
}