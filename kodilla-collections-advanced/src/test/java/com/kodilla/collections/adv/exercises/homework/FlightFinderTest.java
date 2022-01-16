package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    void findFlightsFrom() {
        //given
        FlightFinder finder = new FlightFinder();
        List<Flight> result = finder.findFlightsFrom("New York");
        //when
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("New York", "London"));
    }

    @Test
    void findFlightsTo() {
    }
}