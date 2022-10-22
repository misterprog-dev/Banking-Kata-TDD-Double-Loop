package com.dsoumaila.tdd_double_loop;

import java.util.ArrayList;
import java.util.List;

public class Statement {

    public static final String HEADER = "date | credit | debit | balance";
    private final List<Transaction> transactions = new ArrayList<>();

    public String print() {
        StringBuilder builder = new StringBuilder(HEADER);
        transactions.forEach(transaction -> builder.append("\n").append(transaction.print(null)));
        return builder.toString();
    }

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }
}
