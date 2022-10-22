package com.dsoumaila.tdd_double_loop;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {

    private final BigDecimal amount;
    private final LocalDate date;

    public Transaction(BigDecimal amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return  false;

        Transaction t = (Transaction) o;
        return t.amount.equals(amount) && t.date.equals(date);
    }

    @Override
    public int hashCode() {
        return 31 * amount.hashCode() + date.hashCode() ;
    }
}
