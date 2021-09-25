package za.ac.nwu.as.domain.persistence;

import org.junit.Test;
import za.ac.nwu.as.domain.dto.AccountTypeDto;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class AccountTypeTest {

    @Test
    public void getAccountTypeId() {
        AccountType accountType = new AccountType();
        assertNull(accountType.getAccountTypeId());
    }

    @Test
    public void getMnemonic() {
        AccountType accountType = new AccountType();
        assertNull(accountType.getMnemonic());
    }

    @Test
    public void getAccountTypeName() {
        AccountType accountType = new AccountType();
        assertNull(accountType.getAccountTypeName());
    }

    @Test
    public void getCreationDate() {
        AccountType accountType = new AccountType();
        assertNull(accountType.getCreationDate());
    }

    @Test
    public void getAccountTransactions() {
        AccountType accountType = new AccountType();
        assertNull(accountType.getAccountTransactions());
    }

    /*
    @Test
    public void setAccountTransactions() {
        AccountTransaction accountTransaction = new AccountTransaction();
        AccountType accountType = new AccountType();
        accountType.setAccountTransactions(accountTransaction.getAccountType().getAccountTransactions());
    }*/

    @Test
    public void setAccountTypeId() {
        AccountType accountType = new AccountType();
        accountType.setAccountTypeId(123L);
    }

    @Test
    public void setMnemonic() {
        AccountType accountType = new AccountType();
        accountType.setMnemonic("MILES");
    }

    @Test
    public void setAccountTypeName() {
        AccountType accountType = new AccountType();
        accountType.setAccountTypeName("accountTypeName");
    }

    @Test
    public void setCreationDate() {
        AccountType accountType = new AccountType();
        accountType.setCreationDate(LocalDate.now());
    }
}