package za.ac.nwu.as.domain.persistence;

import org.junit.Test;
import za.ac.nwu.as.domain.dto.AccountTransactionDto;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class AccountTransactionTest {

    @Test
    public void getTransactionId() {
        AccountTransaction accountTransaction = new AccountTransaction();
        assertNull(accountTransaction.getTransactionId());
    }

    @Test
    public void getMemberId() {
        AccountTransaction accountTransaction = new AccountTransaction();
        assertNull(accountTransaction.getMemberId());
    }

    @Test
    public void getAmount() {
        AccountTransaction accountTransaction = new AccountTransaction();
        assertNull(accountTransaction.getAmount());
    }

    @Test
    public void getTransactionDate() {
        AccountTransaction accountTransaction = new AccountTransaction();
        assertNull(accountTransaction.getTransactionDate());
    }

    @Test
    public void getAccountType() {
        AccountTransaction accountTransaction = new AccountTransaction();
        assertNull(accountTransaction.getAccountType());
    }

    @Test
    public void getDetails() {
        AccountTransaction accountTransaction = new AccountTransaction();
        assertNull(accountTransaction.getDetails());
    }

    @Test
    public void setTransactionId() {
        AccountTransaction accountTransaction = new AccountTransaction();
        accountTransaction.setTransactionId(1242L);
    }

    /*
    @Test
    public void setAccountType() {
        AccountTransaction accountTransaction = new AccountTransaction();
        accountTransaction.setAccountType();
    }
    */

    @Test
    public void setMemberId() {
        AccountTransaction accountTransaction = new AccountTransaction();
        accountTransaction.setMemberId(1242L);
    }

    @Test
    public void setAmount() {
        AccountTransaction accountTransaction = new AccountTransaction();
        accountTransaction.setAmount(100L);
    }

    @Test
    public void setTransactionDate() {
        AccountTransaction accountTransaction = new AccountTransaction();
        accountTransaction.setTransactionDate(LocalDate.now());
    }

    /*
    @Test
    public void setDetails() {
        AccountTransaction accountTransaction = new AccountTransaction();
        accountTransaction.setDetails(AccountTransactionDetails);
    }
    */
}