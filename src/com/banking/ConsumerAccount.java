package com.banking;

/**
 * @author Prasenjit Kumar Das
 * Done
 */
public class ConsumerAccount extends Account {
    public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
        super(person, accountNumber, pin, currentBalance);
    }
}
