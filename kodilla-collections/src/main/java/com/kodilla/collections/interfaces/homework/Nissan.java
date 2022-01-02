package com.kodilla.collections.interfaces.homework;

public class Nissan implements Car {

    private int speed;

    public Nissan(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 90;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 30;
    }
}