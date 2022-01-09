package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Nissan nissan = new Nissan();

        Ford ford = new Ford();

        Opel opel = new Opel();

        CarRace carRace = new CarRace();
        System.out.println(carRace.doRace(nissan));
        System.out.println(carRace.doRace(ford));
        System.out.println(carRace.doRace(opel));
    }

    public int doRace(Car car) {
        car.increaseSpeed(15);
        car.increaseSpeed(13);
        car.increaseSpeed(11);
        car.decreaseSpeed();
        car.decreaseSpeed();
        return car.getSpeed();
    }
}