package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Ab", "cD", "21"})
    public void falseIfUsernameShorterThanThreeLetters(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AAA", "Vito12", "Tony201"})
    public void trueIfUsernameLongerOrEqualThreeLetter(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a@pl", "12@com"})
    public void falseIfEmailIncorrect(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"john1@wp.pl", "alfie14@onet.pk"})
    public void trueIfEmailCorrect(String email) {
        assertTrue(userValidator.validateEmail(email));
    }
}