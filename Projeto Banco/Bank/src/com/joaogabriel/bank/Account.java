package com.joaogabriel.bank;

public class Account {

    private String agency;
    private String accountNumber;

    private String name;
    private double balance;
    private static final int max_Lenght = 12;
    private Log logger;

    public Account(String agency, String accountNumber, String name){
        this.agency = agency;
        this.accountNumber = accountNumber;
        setName(name);
        logger = new Log();
    }

    public void setName(String name) {
        if (name.length() > max_Lenght){
            this.name = name.substring(0, max_Lenght);
        }else{
            this.name = name;
        }
    }

    public void deposit(double value){
        balance += value;
        logger.out("DEPOSITO - R$"+value+" O saldo da sua conta agora e de: R$"+ balance);
    }

    public boolean withdraw(double value){
        if (balance < value){
            logger.out("SAQUE - R$"+value+" ERRO - O seu saldo atual e de: R$"+balance);
            return false;
        }else{
            balance -= value;
            logger.out("SAQUE - R$"+value+" O saldo da sua conta agora e de: R$"+ balance);
            return true;
        }
    }

    @Override
    public String toString() {
        String result = "A conta "+this.agency+" / "+this.accountNumber+" / "+this.name+" possui: R$"+balance;
        return result;
    }
}
