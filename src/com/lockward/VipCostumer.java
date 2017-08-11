package com.lockward;

public class VipCostumer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCostumer() {
        this("Default", 0.0d, "Default");
    }

    public VipCostumer(String name, double creditLimit) {
        this(name, creditLimit, "Default");
    }

    public VipCostumer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
