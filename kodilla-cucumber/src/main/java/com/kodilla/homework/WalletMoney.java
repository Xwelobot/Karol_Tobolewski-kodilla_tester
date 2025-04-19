package com.kodilla.homework;

public class WalletMoney {
    private int balance = 0;

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public int getBalance() {
        return balance;
    }
}

