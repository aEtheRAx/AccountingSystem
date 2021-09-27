package za.ac.nwu.as.domain.dto;

import org.junit.Test;
import za.ac.nwu.as.domain.persistence.AccountTransaction;
import za.ac.nwu.as.domain.persistence.AccountTransactionDetails;
import za.ac.nwu.as.domain.persistence.AccountType;

import java.time.LocalDate;

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
    public void setAmount() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        accountTransactionDto.setAmount(100L);
    }

    @Test
    public void setMemberId() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        accountTransactionDto.setMemberId(1242L);
    }

    @Test
    public void setAccountTypeMnemonic() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        accountTransactionDto.setAccountTypeMnemonic("accountTypeMnemonic");
    }

    @Test
    public void setTransactionId() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        accountTransactionDto.setTransactionId(1242L);
    }

    @Test
    public void AccountTransactionDto() {
        AccountType accountType = new AccountType();
        AccountTransaction accountTransaction = new AccountTransaction(123L,accountType,456L,100L,LocalDate.now());
        AccountTransactionDetails details = new AccountTransactionDetails();
        AccountTransactionDto accountTransactionDto01 = new AccountTransactionDto(123L,"accountTypeMnemonic",345L,1500L,LocalDate.now());
        AccountTransactionDto accountTransactionDto02 = new AccountTransactionDto(123L,"accountTypeMnemonic",345L,1500L,LocalDate.now(), details);
        accountTransactionDto01.buildAccountTransaction(accountType);
        AccountTransactionDto accountTransactionDto03 = new AccountTransactionDto(accountTransaction);
        accountTransactionDto01.toString();
        accountTransactionDto01.equals(accountTransactionDto02);
        accountTransactionDto01.hashCode();
    }


    @Test
    public void getDetails() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        assertNull(accountTransactionDto.getDetails());
    }

    @Test
    public void setDetails() {
        AccountTransactionDetails details = new AccountTransactionDetails();
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        accountTransactionDto.setDetails(details);
    }

    @Test
    public void setTransactionDate() {
        AccountTransactionDto accountTransactionDto = new AccountTransactionDto();
        accountTransactionDto.setTransactionDate(LocalDate.now());
    }


}