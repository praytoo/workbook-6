package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private String name;
    private int accountNr;
    private double balance;

    public BankAccount(String name, int accountNr, double balance) {
        this.name = name;
        this.accountNr = accountNr;
        this.balance = balance;
    }

    @Override
    public double getMarketValue() {

        return balance;
    }

    public void withdraw(double amount){
    balance += amount;
    }

    public void deposit(double amount){
    balance += amount;
    }
}
