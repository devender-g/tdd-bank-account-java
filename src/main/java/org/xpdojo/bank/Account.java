package org.xpdojo.bank;

import java.util.ArrayList;

public class Account {

    private int balance;
    private ArrayList<Transaction> transactions;

    public static Account emptyAccount() {
        return new Account();
    }

    private Account() {
        balance = 0;
        transactions = new ArrayList<>();
    }
    public void deposit(int amount) {
        balance += amount;
        transactions.add(new Transaction(amount));
    }

    public int balance() {
        return balance;
    }

    public int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction(amount));
            return amount;
        }
        return -1;
    }

    public void transfer(Account account, int amount) {
        if (balance >= amount){
            int withdrawnAmount = this.withdraw(amount);
            account.deposit(withdrawnAmount);
        }
    }

    public ArrayList<Transaction> printStatement() {
        return transactions;
    }
}
