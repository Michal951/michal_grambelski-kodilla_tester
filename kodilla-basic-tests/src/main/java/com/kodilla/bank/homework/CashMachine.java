package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;
    public int cashWithdrawal;
    public int deposit;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransactions(int transactions);{
        this.size++;
        transactions[this.size] = transactions;
    }
}