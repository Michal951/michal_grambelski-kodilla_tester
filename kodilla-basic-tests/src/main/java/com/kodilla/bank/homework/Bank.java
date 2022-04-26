package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank() {

        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }

    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;

    }


    public int saldo() {
        int saldo = 0;
        for (int i = 0; i < size; i++) {
            saldo += cashMachines[i].saldo();
        }
        return saldo;
    }


    public int numberOfWithrdrals() {
        int numberofWithdrawals = 0;
        for (int i = 0; i < size; i++) {
            numberofWithdrawals += cashMachines[i].getNumberOfWithdraws();
        }
        return numberofWithdrawals;
    }


    public int numberOfPayments() {
        int numberOfPayments = 0;
        for (int i = 0; i < size; i++) {
            numberOfPayments += cashMachines[i].getNumberOfPayments();
        }
        return numberOfPayments;
    }


    public int averageOfWithdraws() {
        int average = 0;
        int size = 0;
        for (int i = 0; i < size; i++) {
            average += cashMachines[i].saldo();
            size += cashMachines[i].getSumOfWithdraws();
        }
        return average / size;
    }

    public int averageOfPayments() {
        int average = 0;
        int size = 0;
        for (int i = 0; i < size; i++) {
            average += cashMachines[i].saldo();
            size += cashMachines[i].getSumOfPayments();
        }
        return average / size;
    }
}