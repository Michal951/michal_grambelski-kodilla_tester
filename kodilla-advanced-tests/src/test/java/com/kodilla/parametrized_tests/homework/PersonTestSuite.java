package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.PersonSources#calculateBMI")
    public void calculateBMI(String input, double heightInMeters, double weightInKilogram) {
        Person person = new Person(heightInMeters, weightInKilogram);
        assertSame(input, person.getBMI());
    }
}
