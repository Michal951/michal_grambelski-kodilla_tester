package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> calculateBMI() {
        return Stream.of(
                Arguments.of("Very severely underweight", 1.70, 15),
                Arguments.of("Severely underweight", 1.70, 30),
                Arguments.of("Underweight", 1.70, 40),
                Arguments.of("Normal (healthy weight)", 1.70, 50),
                Arguments.of("Overweight", 1.70, 60),
                Arguments.of("Obese Class I (Moderately obese)", 1.70, 70),
                Arguments.of("Obese Class II (Severely obese)", 1.70, 80),
                Arguments.of("Obese Class III (Very severely obese)", 1.70, 90),
                Arguments.of("Obese Class IV (Morbidly Obese)", 1.70, 120),
                Arguments.of("Obese Class V (Super Obese)", 1.70, 140),
                Arguments.of("Obese Class VI (Hyper Obese)", 1.70, 220)
        );
    }
}