/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author almi0
 */

public class SavingsAccount extends Account {
    private int months;
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, Person client, int months, double interestRate) {
        super(accountNumber, balance, client);
        this.months = months;
        this.interestRate = interestRate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Not enough funds in savings account.");
        }
    }

    @Override
    public double interestCalculation() {
        return getBalance() * months * (interestRate / 100);
    }
}