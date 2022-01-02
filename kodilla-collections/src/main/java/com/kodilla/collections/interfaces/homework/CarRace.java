package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Nissan nissan = new Nissan(0);

        Ford ford = new Ford(0);

        Opel opel = new Opel(0);

        CarRace carRace = new CarRace();
        System.out.println(carRace.doRace(nissan));
        System.out.println(carRace.doRace(ford));
        System.out.println(carRace.doRace(opel));
    }

    public int doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        return car.getSpeed();
    }
}