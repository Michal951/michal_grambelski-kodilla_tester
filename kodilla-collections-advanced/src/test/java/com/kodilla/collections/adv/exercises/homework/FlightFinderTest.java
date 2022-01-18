package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    void findFlightsFrom() {

        FlightFinder finder = new FlightFinder();
        List<Flight> result = finder.findFlightsFrom("New York");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("New York", "London"));

        assertEquals(expectedList, result);
    }

    @Test
    void findFlightsTo() {
        FlightFinder finder = new FlightFinder();
        List<Flight> result = finder.findFlightsTo("Gdańsk");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Dublin", "Gdańsk"));
        expectedList.add(new Flight("Warsaw", "Gdańsk"));

        assertEquals(expectedList, result);
    }
}