package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectAddResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.add(8,2);
        Assertions.assertEquals(10,value);
    }

    @Test
    public void shouldReturnCorrectSubResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.subtract(8,2);
        Assertions.assertEquals(6,value);
    }

    @Test
    public void shouldReturnCorrectMultiplyResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.multiply(8,2);
        Assertions.assertEquals(16,value);
    }

    @Test
    public void shouldReturnCorrectDivResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.divide(8,2);
        Assertions.assertEquals(4,value);
    }
}