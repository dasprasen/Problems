package com.banking;

import java.util.LinkedHashMap;
import java.util.UUID;

/**
 * @author Prasenjit Kumar Das
 */
public class Bank implements BankInterface {
    private LinkedHashMap<Long, Account> accounts;

    public Bank() {
        this.accounts = new LinkedHashMap<>();
    }

    private Account getAccount(Long accountNumber) {
        return accounts.get(accountNumber);
    }

    @Override
    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        Long accountNumber = generateAccountNumber(); // generate a new account number
        CommercialAccount account = new CommercialAccount(company, accountNumber, pin, startingDeposit);
        accounts.put(account.getAccountNumber(), account);
        return account.getAccountNumber();
    }

    @Override
    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        Long accountNumber = generateAccountNumber(); // generate a new account number
        ConsumerAccount account = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
        accounts.put(account.getAccountNumber(), account);
        return account.getAccountNumber();
    }

    private Long generateAccountNumber() {
        UUID uuid = UUID.randomUUID(); // generate a new UUID
        long accountNumber = Math.abs(uuid.getMostSignificantBits()); // use the most significant bits of the UUID as the account number
        while (accounts.containsKey(accountNumber)) { // make sure the account number is unique
            uuid = UUID.randomUUID();
            accountNumber = Math.abs(uuid.getMostSignificantBits());
        }
        return accountNumber;
    }

    @Override
    public boolean authenticateUser(Long accountNumber, int pin) {
        Account account = getAccount(accountNumber);
        if (account != null && account.validatePin(pin)) {
            return true;
        }
        return false;
    }

    @Override
    public double getBalance(Long accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            return account.getBalance();
        }
        return -1;
    }

    @Override
    public void credit(Long accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.creditAccount(amount);
        }
    }

    @Override
    public boolean debit(Long accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null && account.getBalance() >= amount) {
            account.debitAccount(amount);
            return true;
        }
        return false;
    }
}
