package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_aseration.ResultChecker.assertEquals;

class BankTestSuite {

    CashMachine cashMachine ;
    CashMachine cashMachine2 ;
    @BeforeEach
    private void setUp(){
         cashMachine = new CashMachine();
         cashMachine2 = new CashMachine();
    }

    @Test
    public void averageOfPayments() {

        Bank bank = new Bank();
        cashMachine.addTransaction(300);
        cashMachine2.addTransaction(300);
        bank.add(cashMachine);
        bank.add(cashMachine2);
        int number = bank.averageOfPayments();
        assertEquals(300, number);
    }

    @Test
    public void averageOfWithdraws() {
        Bank bank = new Bank();
        cashMachine.addTransaction(300);
        cashMachine2.addTransaction(300);
        bank.add(cashMachine);
        bank.add(cashMachine2);
        int average = bank.averageOfWithdraws();
        assertEquals(300, average);
    }

    @Test
    public void numberOfPayments() {
        Bank bank = new Bank();
        cashMachine.addTransaction(1);
        cashMachine2.addTransaction(1);
        bank.add(cashMachine);
        bank.add(cashMachine2);
        int number = bank.numberOfPayments();
        assertEquals(2, number);
    }

    @Test
    public void numberOfWithdraws() {
        Bank bank = new Bank();
        cashMachine.addTransaction(3);
        cashMachine2.addTransaction(1);
        bank.add(cashMachine);
        bank.add(cashMachine2);
        int number = bank.numberOfWithrdrals();
        assertEquals(4, number);
    }

    @Test
    public void shouldReturnZeroIfNoPayments() {
        int all = bank.saldo();
        assertEquals(0, all);
    }
}