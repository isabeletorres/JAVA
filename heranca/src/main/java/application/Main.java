package application;

import entities.*;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.whithdraw(200.0);

        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);

        acc2.whithdraw(200.0);

        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

        acc3.whithdraw(200.0);

        System.out.println(acc3.getBalance());

    }
}