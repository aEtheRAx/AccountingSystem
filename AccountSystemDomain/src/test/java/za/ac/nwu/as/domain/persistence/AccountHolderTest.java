package za.ac.nwu.as.domain.persistence;

import org.junit.Test;
import za.ac.nwu.as.domain.dto.AccountHolderDto;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class AccountHolderTest {

    @Test
    public void getMemberId() {
        AccountHolder accountHolder = new AccountHolder();
        assertNull(accountHolder.getMemberId());
    }

    @Test
    public void getMemberName() {
        AccountHolder accountHolder = new AccountHolder();
        assertNull(accountHolder.getMemberName());
    }

    @Test
    public void getBalance() {
        AccountHolder accountHolder = new AccountHolder();
        assertNotNull(accountHolder.getBalance());
    }

    @Test
    public void getCurrency() {
        AccountHolder accountHolder = new AccountHolder();
        assertNull(accountHolder.getCurrency());
    }

    @Test
    public void getStartDate() {
        AccountHolder accountHolder = new AccountHolder();
        assertNull(accountHolder.getStartDate());
    }

    @Test
    public void setMemberId() {
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setMemberId(1242L);
    }

    @Test
    public void setMemberName() {
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setMemberName("John");
    }

    @Test
    public void setBalance() {
        AccountHolderDto accountHolderDto = new AccountHolderDto();
        accountHolderDto.setBalance(1000);
    }

    @Test
    public void setCurrency() {
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setCurrency("MILES");
    }

    @Test
    public void setStartDate() {
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setStartDate(LocalDate.now());
    }
}