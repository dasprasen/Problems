package com.banking;

/**
 * @author Prasenjit Kumar Das
 */
public class Transaction implements TransactionInterface {
    private Long accountNumber;
    private Bank bank;

    public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
        this.accountNumber = accountNumber;
        this.bank = bank;
        if (!bank.authenticateUser(accountNumber, attemptedPin)) {
            throw new Exception("Account validation failed.");
        }
    }

    @Override
    public double getBalance() {
        return bank.getBalance(accountNumber);
    }

    @Override
    public void credit(double amount) {
        bank.credit(accountNumber, amount);
    }

    @Override
    public boolean debit(double amount) {
        return bank.debit(accountNumber, amount);
    }
}
