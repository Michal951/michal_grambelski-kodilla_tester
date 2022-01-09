package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private int speed = 0;


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed(int speed) {
        this.speed += speed;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 20;
    }
}