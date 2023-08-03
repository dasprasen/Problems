package com.banking;

/**
 * @author Prasenjit Kumar Das
 * Done
 */
public abstract class Account implements AccountInterface {
    private AccountHolder accountHolder;
    private Long accountNumber;
    private int pin;
    private double balance;

    protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = startingDeposit;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public boolean validatePin(int attemptedPin) {
        return this.pin == attemptedPin;
    }

    public double getBalance() {
        return balance;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void creditAccount(double amount) {
        this.balance += amount;
    }

    @Override
    public boolean debitAccount(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
