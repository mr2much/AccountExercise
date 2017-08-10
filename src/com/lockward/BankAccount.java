package com.lockward;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void addFunds(int amount) {
        System.out.println("Adding: " + amount + " to account.");
        balance += amount;
    }

    public int withdraw(int amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds.");
            return -1;
        } else {
            System.out.println("Withdrawing " + amount + " from account.");
            balance -= amount;

            return amount;
        }
    }

    public void checkBalance() {
        System.out.println("The account balance is " + balance);
    }
}
