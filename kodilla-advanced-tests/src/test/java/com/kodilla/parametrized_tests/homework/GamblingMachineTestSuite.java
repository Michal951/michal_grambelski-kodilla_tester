package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;


class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/GoodNumbers.csv")
    public void shouldWin(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four);
        set.add(five);
        set.add(six);
        boolean result = gamblingMachine.howManyWins(set) <= 6;
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongNumbers.csv")

    public void notWin(int one, int two, int three, int four, int five, int six) {
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
    public void errorIfAddOneGoodValue() {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(5);
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/GoodNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnTrueWhenNumbersAreFromInterval(String input) throws InvalidNumbersException {
        String[] numbersTable = input.split(" ");
        Set<Integer> numbersSet = new HashSet<>();
        GamblingMachine gamblingMachine = new GamblingMachine();

        for (int i = 0; i < numbersTable.length; i++){
            numbersSet.add(Integer.valueOf(numbersTable[i]));}

        int inputFinal = gamblingMachine.howManyWins(numbersSet);
        System.out.println("WINS: " + inputFinal);
        assertTrue(inputFinal > 0);
    }
}