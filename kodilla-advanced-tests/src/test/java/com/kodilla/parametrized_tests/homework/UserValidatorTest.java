package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"^[a-zA-Z0-9._-]{3,}$"})
    public void falseIfUsernameShorterThanThreeLetters(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"^[a-zA-Z0-9._-]{3,}$"})
    public void falseIfUsernameLongerThanThreeLetters(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$"})
    public void falseIfEmailIncorrect(String input) {
        assertFalse(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$"})
    public void trueIfEmailCorrect(String input) {
        assertFalse(userValidator.validateEmail(input));
    }
}