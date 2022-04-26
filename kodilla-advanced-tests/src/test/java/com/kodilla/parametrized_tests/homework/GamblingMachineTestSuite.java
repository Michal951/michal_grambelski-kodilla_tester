package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;


class GamblingMachineTestSuite {
    @ParameterizedTest
    @CsvFileSource(resources = "/GoodNumbers.csv", numLinesToSkip = 1)
    public void should_check_wins_works(int one, int two, int three, int four, int five, int six)
            throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four);
        set.add(five);
        set.add(six);
        int x = gamblingMachine.howManyWins(set);
        Assertions.assertTrue(x <= 6);
        Assertions.assertTrue(x >= 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongNumbers.csv")

    public void should_error_if_add_bad_values_only_numbers(int one, int two, int three, int four, int five, int six) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four);
        set.add(five);
        set.add(six);
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });

    }

    @Test
    public void should_error_if_add_one_good_value() {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(5);
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }
}