package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

public class CarApplication {

    private static Object Car;
    private static Opel opel;
    private static Ford ford;
    private static Nissan nissan;

    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(15);

        if (size == 0) {
            size = 1;
        }

        Car[] cars = new Car[size];
        for (int c = 0; c < cars.length; c++)
            cars[c] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCar = random.nextInt(2);

        if (drawnCar == 0) {
            opel = new Opel();
            opel.increaseSpeed(random.nextInt(76));
            return opel;
        } else if (drawnCar == 1) {
            ford = new Ford();
            ford.increaseSpeed(random.nextInt(55));
            return ford;
        } else {
            nissan = new Nissan();
            nissan.increaseSpeed(random.nextInt(97));
            return nissan;
        }
    }
}