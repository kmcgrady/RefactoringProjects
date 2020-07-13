package com.ga.code.codesample2;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<BankAccount> bankAccounts;

    public Person(String name) {
        this.name = name;
        this.bankAccounts = new ArrayList<BankAccount>();
    }

    public String getName() {
        return this.name;
    }

    public List<BankAccount> getBankAccounts() {
        return this.bankAccounts;
    }

    public void addAccount(String name, int balance) {
        this.bankAccounts.add(new BankAccount(name, balance));
    }
}
