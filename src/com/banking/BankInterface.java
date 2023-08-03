package com.banking;

/**
 * @author Prasenjit Kumar Das
 */
public interface BankInterface {
    public Long openCommercialAccount(Company company, int pin, double startingDeposit);
    public Long openConsumerAccount(Person person, int pin, double startingDeposit);
    public boolean authenticateUser(Long accountNumber, int pin);
    public double getBalance(Long accountNumber);
    public void credit(Long accountNumber, double amount);
    public boolean debit(Long accountNumber, double amount);
}
