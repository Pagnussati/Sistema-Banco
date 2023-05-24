package com.joaogabriel.bank;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank nuBank = new Bank("0237");

        while (true){
            System.out.println(" C - Criar conta \n X - Sair");
            String operationsB = sc.nextLine();
            operationsB = operationsB.toUpperCase();
            if (operationsB.equals("C")){
                System.out.println("Digite seu nome: ");
                String name = sc.nextLine();
                Account account = nuBank.generateAccount(name);
                nuBank.insertAccount(account);

                operateAccount(account) ;
            } else if (operationsB.equals("X")) {
                break;
            }else {
                System.out.println("Comando Invalido");
            }
        }

        List<Account> accountList = nuBank.getAccounts();
        for (Account account : accountList){
            System.out.println(account);
        }

        }

        static void operateAccount(Account account){
        Scanner sc = new Scanner(System.in);
            while (true){
                System.out.println(" S - Saque \n D - Deposito \n X - Sair");
                String operation = sc.nextLine();
                operation = operation.toUpperCase();
                if (operation.equals("D")){
                    System.out.println("Digite o valor do deposito: ");
                    double value = sc.nextDouble();
                    account.deposit(value);
                } else if (operation.equals("S")) {
                    System.out.println("Digite o valor do saque: ");
                    double value = sc.nextDouble();
                    account.withdraw(value);
                } else if (operation.equals("X")) {
                    break;
                }else{
                    System.out.println("Comando Invalido");
                }

                sc = new Scanner(System.in);
            }

    }

}
