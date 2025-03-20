package entities;

public class Account {
    private final Integer number;
    private String holder;
    private double balance;

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= (amount + 5.0);
    }

    @Override
    public String toString() {
        return "Account " +
                number +
                ", Holder" + holder +
                ", Balance $" + balance
                ;
    }
}
