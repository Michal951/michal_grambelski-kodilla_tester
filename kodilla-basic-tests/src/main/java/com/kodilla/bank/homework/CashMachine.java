package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;
    public int cashWithdrawal;
    public int deposit;

    public CashMachine(int transactions, int size, int cashWithdrawal, int deposit) {
        this.transactions = new int[0];
        this.size = 0;
        this.cashWithdrawal = cashWithdrawal;
        this.deposit = deposit;
    }
}