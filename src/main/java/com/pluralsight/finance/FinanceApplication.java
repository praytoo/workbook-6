package com.pluralsight.finance;

public class FinanceApplication {
    static void main() {
        BankAccount account1 = new BankAccount("Pam", 123, 12500);
        Valuable account2 = new BankAccount("Gary", 456, 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        //account2.deposit(100);
    }
    //Did the deposit work for both accounts? Why or why not?
    //account1 only had a successful deposit. Account2 couldn't because the method deposit is not inside of Valuable.
    //What methods are available for account1?
    //-deposit() and withdraw()
    //What methods are available for account2?
    //-getValue()
}
