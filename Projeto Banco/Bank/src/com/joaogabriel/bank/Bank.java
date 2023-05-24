package com.joaogabriel.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String agency;
    private List<Account> accounts;
    private int lastAccount = 1113;

    public void insertAccount(Account account){
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Bank(String agency){
        this.agency = agency;
        this.accounts = new ArrayList<>();
    }

    public Account generateAccount(String name){
        Account account = new Account(agency,""+ lastAccount, name);
        lastAccount++;
        return account;
    }

}
