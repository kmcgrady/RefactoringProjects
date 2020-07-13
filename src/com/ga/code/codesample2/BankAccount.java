package com.ga.code.codesample2;

public class BankAccount {
    private String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public BankAccount(String name) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) throws IllegalArgumentException {
        if (amount > this.balance) {
            throw new IllegalArgumentException("Unable to withdraw this amount of money.");
        }

        this.balance -= amount;
    }
}
