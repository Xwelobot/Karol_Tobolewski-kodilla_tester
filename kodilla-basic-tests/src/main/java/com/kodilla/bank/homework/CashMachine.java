package com.kodilla.bank.homework;

public class CashMachine {

    private double[] transactions;

    public CashMachine() {
        this.transactions = transactions;
    }

    public double getSaldo() {
        double saldo = 0;
        for(double transaction : transactions) {
            saldo += transactions;
        }
        return saldo;
    }

    public int getTransactionIn() {
        int count = 0;
        for (double transaction : transactions) {
            if (transaction > 0) {
                count++;
            }
        }
        return count;
    }

    public int getTransactionOut() {
        int count = 0;
        for (double transaction : transactions) {
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


