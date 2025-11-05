package com.pluralsight.finance;

public class CreditCard implements Valuable{
    private String name;
    private int accountNr;
    private double balance;

    public CreditCard(String name, int accountNr, double balance) {
        this.name = name;
        this.accountNr = accountNr;
        this.balance = balance;
    }

    @Override
    public double getMarketValue() {

        return balance;
    }

    public void charge(double amount){
    balance -= amount;
    }

    public void pay(double amount){
    balance -= amount;
    }
}
