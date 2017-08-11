package com.lockward;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.checkBalance();
        account.addFunds(100.0d);
        account.addFunds(50.0d);
        account.withdraw(90.0d);
        account.withdraw(100.0d);

        BankAccount bobAccount = new BankAccount(1, 255.99d, "Bob Bobby",
                "a.bc@def.com", "(XXX) 333-4444");

        System.out.println("Account number: " + bobAccount.getAccountNumber());
        System.out.println("Name: " + bobAccount.getCustomerName());
        System.out.println("Email: " + bobAccount.getEmail());
        System.out.println("Phone Number: " + bobAccount.getPhoneNumber());
        bobAccount.checkBalance();

        bobAccount.addFunds(37.45d);
        bobAccount.withdraw(106.33d);

        VipCostumer anubis = new VipCostumer("Anubis", 1_000.0d, "alb@lockward.com");

        System.out.println("Name: " + anubis.getName());
        System.out.println("Credit Limit: " + anubis.getCreditLimit());
        System.out.println("Email: " + anubis.getEmailAddress());

        VipCostumer costumer2 = new VipCostumer("Juan", 100_000.0d);

        System.out.println("Name: " + costumer2.getName());
        System.out.println("Credit Limit: " + costumer2.getCreditLimit());
        System.out.println("Email: " + costumer2.getEmailAddress());

        VipCostumer costumer3 = new VipCostumer();

        System.out.println("Name: " + costumer3.getName());
        System.out.println("Credit Limit: " + costumer3.getCreditLimit());
        System.out.println("Email: " + costumer3.getEmailAddress());

    }
}
