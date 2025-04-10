package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, " Maria", 0.0, 500.0);

        //Upcasting

        Account acc1 = businessAccount;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //Dowcansting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

    }
}