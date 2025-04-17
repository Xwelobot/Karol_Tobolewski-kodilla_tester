package com.kodilla.homework;

public class WalletMoney {
    private int balance = 0;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public int getBalance() {
        return balance;
    }
}

