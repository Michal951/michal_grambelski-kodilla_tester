package com.kodilla.basic.asseration;

import com.kodilla.basic_aseration.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testPow() {

        Calculator calculator = new Calculator();

        int powResult1 = calculator.pow(3, 2);
        int powResult2 = calculator.pow(3, 0);
        int powResult3 = calculator.pow(-3, 2);


        assertEquals(9, powResult1);
        assertEquals(1, powResult2);
        assertEquals(9, powResult3);
    }
}