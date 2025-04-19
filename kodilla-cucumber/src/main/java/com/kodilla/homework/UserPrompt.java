package com.kodilla.homework;

public class UserPrompt {
    private String message;
    private double balance;

    public UserPrompt() {
    }

    public UserPrompt(String message, double balance) {
        this.message = message;
        this.balance = balance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return message + " (Current balance: $" + balance + ")";
    }
}
