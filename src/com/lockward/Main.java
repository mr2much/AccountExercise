package com.lockward;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.checkBalance();
        account.addFunds(100);
        account.addFunds(50);
        account.withdraw(90);
        account.withdraw(100);
    }
}
