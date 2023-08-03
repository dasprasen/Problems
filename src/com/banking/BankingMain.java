package com.banking;

/**
 * @author Prasenjit Kumar Das
 */
public class BankingMain {
    public static void main(String[] args) throws Exception {
        Person person = new Person("prasenjit", "das", 111);
        Company company = new Company("ABC", 222);
        Bank bank = new Bank();
        bank.openConsumerAccount(person, 123, 10000);
        bank.openCommercialAccount(company, 234, 50000);
    }
}
