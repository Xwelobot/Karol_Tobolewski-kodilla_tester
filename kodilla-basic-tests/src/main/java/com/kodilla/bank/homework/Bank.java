package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
            this.cashMachines = cashMachines;
    }
    public int getSaldoOfAllCashMachine() {
        int totalSaldo = 0;
        for (CashMachine machine : cashMachines) {
            totalSaldo += machine.getSaldo();
        }
        return totalSaldo;
    }

    public int getTransactionIn() {
        int totalIn = 0;
        for(CashMachine machine : cashMachines){
            totalIn += machine.getTransactionIn();
            }
        return totalIn;
        }

    public int getTransactionOut() {
        int totalOut = 0;
        for (CashMachine machine : cashMachines){
            totalOut += machine.getTransactionOut();
            }
        return totalOut;
        }

    public double getAverageIn(){
        double sum = 0;
        int count = 0;
        for(CashMachine machine : cashMachines){
            sum += machine.getAverageIn();
            count++;
        }
        return (count > 0) ? sum / count : 0;
    }

    public double getAverageOut(){
        double sum = 0;
        int count = 0;
        for(CashMachine machine : cashMachines){
            sum += machine.getAverageOut();
            count++;
        }
        return (count >0 ) ? sum / count : 0;
    }
}


