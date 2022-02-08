package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {
    Display display = new Display();
    Calculator calculator = new Calculator(display);

    @Test
    public void shouldReturnAddResult() {
        double a = 3.4;
        double b = 2.1;
        double sumResult = calculator.add(a, b);
        assertEquals(5.6, sumResult);

    }

    @Test
    public void shouldReturnSubResult() {
        double a = 15.1;
        double b = 4.5;
        double result = calculator.subtract(a, b);
        assertEquals(1.0, result);
    }

    @Test
    public void shouldReturnMultiplyResult() {
        double a = 3.5;
        double b = 10;
        double result = calculator.multiply(a, b);
        assertEquals(35, result);
    }

    @Test
    public void shouldReturnDivResult() {
        double a = 21.3;
        double b = 3;
        double result = calculator.divide(a, b);
        assertEquals(7.1, result);
    }
}