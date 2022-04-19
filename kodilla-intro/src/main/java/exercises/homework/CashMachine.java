package exercises.homework;

public class CashMachine {
    public int transactions[];
    public int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void AddTransaction(int transactions) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transactions;
        this.transactions = newTab;
    }
    public int[] getTransactions() {
        return transactions;
    }

    public double getAverageOfPayments() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double average = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            average += this.transactions[i];
        }
        return average / this.transactions.length;
    }


    public int saldo() {
        int saldo = 0;
        for (int transactions : transactions) {
            saldo = saldo + transactions;
        }
        return saldo;
    }

    public int withdrawalCounting() {
        int money = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
               money++;
            }
        }
        return money;
    }
    public int depositCounting() {
        int money = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                money++;
            }
        }
        return money;


}
}