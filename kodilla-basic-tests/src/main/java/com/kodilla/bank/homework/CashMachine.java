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


    public double getAverageOfPayments() {
        if (this.transactions.length == 0) {
            return 0;
        } else {
            double avg = 0;
            int operation = 0;
            for (int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] > 0) {
                    avg += this.transactions[i];
                    operation += 1;
                }
            }
            return avg / operation;
        }
    }


    public double getAverageOfWithdraws() {
        if (this.transactions.length == 0) {
            return 0;
        } else {
            double average = 0;
            int operation = 0;
            for (int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] < 0) {
                    average += this.transactions[i];
                    operation += 1;
                }
            }
            return average / operation * -1;
        }
    }

    public int getNumberOfWithdraws() {
        int withdraw = 0;
        if (this.transactions.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] < 0) {
                    withdraw += 1;
                }
            }
        }
        return withdraw;
    }


    public int getNumberOfPayments() {
        int payment = 0;
        if (this.transactions.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] > 0) {
                    payment += 1;
                }
            }
        }
        return payment;
    }


    public int saldo() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum += transactions[i];
        }
        return sum;
    }
}