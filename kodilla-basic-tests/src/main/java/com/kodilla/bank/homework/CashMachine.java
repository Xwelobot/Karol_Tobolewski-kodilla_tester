package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void add(int transaction) {
        this.size++;
        int[] tr = new int[this.size];
        System.arraycopy(transactions,0,tr ,0, transactions.length);
        tr[this.size - 1] = transaction;
        this.transactions = tr;
    }

    public int[] getTr() {
        return transactions;
    }

    public int getSaldo() {
        int saldo = 0;
        for(int transaction : transactions) {
            saldo = saldo + transaction;
        }
        return saldo;
    }

    public int getTransactionIn() {
        int count = 0;
        for (int transaction : transactions) {
            if (transaction > 0) {
                count++;
            }
        }
        return count;
    }

    public int getTransactionOut() {
        int count = 0;
        for (int transaction : transactions) {
            if (transaction < 0) {
                count++;
            }
        }
        return count;
    }

    public double getAverageIn() {
        double sum = 0;
        int count = 0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                sum += transaction;
                count++;
            }
        }
        return (count > 0) ? sum / count : 0;
    }

    public double getAverageOut() {
        double sum = 0;
        int count = 0;
        for (double transaction : transactions) {
            if (transaction < 0) {
                sum += transaction;
                count++;
            }
        }
        return (count > 0) ? sum / count : 0;
    }

    public double getNumberOfTransactions() {
        return transactions.length;
    }
}


