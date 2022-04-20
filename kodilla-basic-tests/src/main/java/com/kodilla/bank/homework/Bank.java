package com.kodilla.bank.homework;

public class Bank {
    static int payments;
    static int numberOfPayments;
    static int withdraws;
    static int numberOfWithdraws;
    CashMachine transaction;

    public void addTransaction(int transactions) {
        this.transaction.addTransaction(transactions);
        if (transactions > 0) {
            payments += transactions;
            numberOfPayments++;
        } else if (transactions < 0) {
            withdraws += transactions;
            numberOfWithdraws++;
        }
    }

    public int[] numberOfTransaction() {
        return this.transaction.getTransactions();
    }

    public int saldo() {
        return this.transaction.saldo();
    }

    public int numberOfPayments() {
        return this.transaction.getNumberOfPayments();
    }


    public double numberOfWithdraws() {
        return this.transaction.getNumberOfWithdraws();
    }

    public double averageOfPayment() {
        return this.transaction.getAverageOfPayments();
    }

    public double averageofWithdraws() {
        return this.transaction.getAverageOfWithdraws();
    }

    public static double averageOfEveryPayments() {
        if (numberOfPayments == 0)
            return 0;
        else
            return payments / numberOfPayments;

    }

    public static double averageOfEveryWithdraws() {
        if (numberOfWithdraws == 0)
            return 0;
        else
            return withdraws / numberOfWithdraws;

    }
}
