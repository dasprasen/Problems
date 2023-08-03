package com.banking;

/**
 * @author Prasenjit Kumar Das
 * Done
 */
public interface AccountInterface {
    AccountHolder getAccountHolder();
    boolean validatePin(int attemptedPin);
    double getBalance();
    Long getAccountNumber();
    void creditAccount(double amount);
    boolean debitAccount(double amount);
}
