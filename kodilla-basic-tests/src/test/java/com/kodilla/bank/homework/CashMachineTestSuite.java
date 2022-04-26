package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_aseration.ResultChecker.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoTransactions() {
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(100);

        int[] operations = cashMachine.getTransactions();
        assertEquals(2, operations.length);
        assertEquals(20, operations[0]);
        assertEquals(100, operations[1]);
    }

    @Test
    public void shouldReturnZeroPaymentsWhenArrayIsEmpty() {
        int numberOfPayments = cashMachine.getNumberOfPayments();
        assertEquals(0, numberOfPayments);
    }

    @Test
    void shouldCalculateSumOfPayments() {
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(30);
        assertEquals(200, cashMachine.getSumOfPayments());
    }

    @Test
    void shouldCalculateSumOfWithdraws() {
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-80);
        assertEquals(-100, cashMachine.getNumberOfWithdraws());
    }

    @Test
    public void shouldCalculateNumberOfWithdraws() {
        cashMachine.addTransaction(-250);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-50);
        assertEquals(3, cashMachine.getNumberOfWithdraws());
    }

    @Test
    public void ifPaymentsCountingIsCorrect() {
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(100);
        assertEquals(2, cashMachine.getNumberOfPayments());
    }
}