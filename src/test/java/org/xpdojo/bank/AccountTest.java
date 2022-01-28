package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.xpdojo.bank.Account.emptyAccount;

public class AccountTest {


    @Test
	public void initialAccount_hasZeroBalance() {
        assertThat(emptyAccount().balance()).isEqualTo(0);
    }

    @Test
    public void depositAmount_shouldIncreaseBalanceBySameAmount(){
        Account account = emptyAccount();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleAmounts_shouldIncreaseBalanceByBothAmounts() {
        Account account = emptyAccount();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void withdrawMoney_fromEmptyAccount() {
        Account account = emptyAccount();
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void withdrawMoney_shouldDecreaseBalance() {
        Account account = emptyAccount();
        account.deposit(100);
        int amount = account.withdraw(20);
        assertThat(amount).isEqualTo(20);
        assertThat(account.balance()).isEqualTo(80);
    }

    @Test
    public void transferMoney_shouldWithdrawFromOneAccount_AndAddedToAnother(){
        Account account1 = emptyAccount();
        account1.deposit(100);
        Account account2 = emptyAccount();
        account1.transfer(account2, 10);
        assertThat(account1.balance()).isEqualTo(90);
        assertThat(account2.balance()).isEqualTo(10);
    }
}
