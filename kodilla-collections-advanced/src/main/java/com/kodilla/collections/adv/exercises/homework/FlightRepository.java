package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("New York", "London"));
        flights.add(new Flight("Berlin", "Tokio"));
        flights.add(new Flight("Warsaw", "Paris"));
        flights.add(new Flight("Moscow", "Chicago"));
        flights.add(new Flight("Dublin", "Gdańsk"));
        return flights;
    }
}
