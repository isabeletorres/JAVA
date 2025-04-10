package application;

import entities.*;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1001, "Alex", 1000.0);
        account.whithdraw(200.0);

        System.out.println(account.getBalance());

        Account acc1 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);

        acc1.whithdraw(200.0);

        System.out.println(acc1.getBalance());


    }
}