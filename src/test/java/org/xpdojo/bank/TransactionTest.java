package org.xpdojo.bank;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TransactionTest {

    @Test
    public void transaction_shouldBeCreatedWithDateAndAmount(){
        Transaction transaction = new Transaction(100);
        assertThat(transaction.amount()).isEqualTo(100);
    }
}
