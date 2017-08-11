package com.lockward;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {

    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void addFunds(double amount) {
        balance += amount;
        System.out.println("Made a deposit of " + amount + " your new balance is " + balance);
    }

    public void withdraw(double amount) {
        if(balance - amount < 0) {
            System.out.println("Not enough funds to widraw " + amount + " your balance is " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawing " + amount + " from account, new balance is " + balance);
        }
    }

    public void checkBalance() {
        System.out.println("The account balance is " + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
