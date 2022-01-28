package org.xpdojo.bank;

import java.util.Date;

public class Transaction {

    private Date date;
    private int amount;
    public Transaction(int amount) {
        date = new Date();
        this.amount = amount;
    }
}
