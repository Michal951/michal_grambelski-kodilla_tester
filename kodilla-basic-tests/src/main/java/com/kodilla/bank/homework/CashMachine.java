package com.kodilla.bank.homework;

public class CashMachine {
    public int transactions[];
    public int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public int[] getTransactions() {
        return transactions;
    }


    public void addTransaction(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transaction, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }


    public int getSumOfPayments() {
        int paymentsSum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                paymentsSum += transactions[i];
            }
        }
        return paymentsSum;
    }


    public int getSumOfWithdraws() {
        int withdrawalSum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                withdrawalSum += transactions[i];
            }
        }
        return withdrawalSum;
    }


    public int getNumberOfWithdraws() {
        int withdraw = 0;
        for (int i = 0; i < size; i++) {
            if (transactions[i] < 0) {
                withdraw++;
            }
        }
        return withdraw;
    }


    public int getNumberOfPayments() {
        int payments = 0;
        for (int i = 0; i < size; i++) {
            if (transactions[i] > 0) {
                payments++;
            }
        }
        return payments;
    }


    public int saldo() {
        int saldo = 0;
        for (int i = 0; i < transactions.length; i++) {
            saldo += transactions[i];
        }
        return saldo;
    }
}