package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car{
    private boolean lightsOn;

    @Override
    public boolean hasHeadlightsTurnedOn(){
        return  lightsOn;
    }

    @Override
    public String getTypeCar() {
        return "SUV";
    }
}
