package com.dsoumaila.tdd_double_loop;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Account {
    private final Statement statement;
    public Account(Statement statement) {
        this.statement = statement;
    }

    public String printStatement() {
        return statement.print();
    }

    public void deposit(BigDecimal bigDecimal, LocalDate of) {
    }

    public void withdraw(BigDecimal bigDecimal, LocalDate of) {
    }
}
