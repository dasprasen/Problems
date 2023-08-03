package com.banking;

/**
 * @author Prasenjit Kumar Das
 * Done
 */
public abstract class AccountHolder {
    private int idNumber;

    public AccountHolder(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
