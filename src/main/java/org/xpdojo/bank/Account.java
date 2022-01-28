package org.xpdojo.bank;

public class Account {

    private int balance;
    public static Account emptyAccount() {
        return new Account();
    }

    private Account() {
        balance = 0;
    }
    public void deposit(int amount) {
        balance += amount;
    }

    public int balance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }
}
