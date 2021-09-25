package za.ac.nwu.as.domain.dto;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTransactionDtoTest {

    @Test
    public void getTransactionId() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        assertNull(accountTransactionDto.getTransactionId());
    }

    @Test
    public void getAccountTypeMnemonic() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        assertNull(accountTransactionDto.getAccountTypeMnemonic());
    }

    @Test
    public void getMemberId() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        assertNull(accountTransactionDto.getMemberId());
    }

    @Test
    public void getAmount() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        assertNull(accountTransactionDto.getAmount());
    }

    @Test
    public void getTransactionDate() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        assertNull(accountTransactionDto.getTransactionDate());
    }

    @Test
    public void getDetails() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        assertNull(accountTransactionDto.getDetails());
    }
}