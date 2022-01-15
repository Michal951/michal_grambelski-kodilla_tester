package com.kodilla.collections.adv.exercises.homework;

public class Flight {
    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }
}