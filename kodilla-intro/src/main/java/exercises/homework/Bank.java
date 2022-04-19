package exercises.homework;

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

    public int withdrawalAverage(){
        int totalWithdrawal = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalWithdrawal += cashMachines[i].sumWithdrawalCounting();
        }
        return totalWithdrawal / sumWithdrawalNumber();
    }

}
