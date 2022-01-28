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

    public int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
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
}
