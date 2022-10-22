package com.dsoumaila.tdd_double_loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AccountTest {
    @Test
    public void should_print_statement() {
        // GIVEN
        Statement statement = mock(Statement.class);
        when(statement.print()).thenReturn("Printed Statement");
        Account account = new Account(statement);

        // WHEN
        String printedStatement = account.printStatement();

        // THEN
        assertThat(printedStatement).isEqualTo("Printed Statement");
    }



}
