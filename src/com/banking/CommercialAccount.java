package com.banking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prasenjit Kumar Das
 * Done
 */
public class CommercialAccount extends Account {
    private List<Person> authorizedUsers;

    public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
        super(company, accountNumber, pin, startingDeposit);
        this.authorizedUsers = new ArrayList<>();
    }

    protected void addAuthorizedUsers(Person person) {
        this.authorizedUsers.add(person);
    }

    public boolean isAuthorizedUser(Person person) {
        return this.authorizedUsers.contains(person);
    }
}
