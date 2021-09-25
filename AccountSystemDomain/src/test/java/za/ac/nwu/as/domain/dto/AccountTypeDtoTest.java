package za.ac.nwu.as.domain.dto;

import org.junit.Test;
import za.ac.nwu.as.domain.persistence.AccountType;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class AccountTypeDtoTest {

    @Test
    public void getMnemonic() {
        AccountTypeDto accountTypeDto = new AccountTypeDto();
        assertNull(accountTypeDto.getMnemonic());
    }

    @Test
    public void setMnemonic() {
        AccountTypeDto accountTypeDto = new AccountTypeDto();
        accountTypeDto.setMnemonic("MILES");
    }

    @Test
    public void getAccountTypeName() {
        AccountTypeDto accountTypeDto = new AccountTypeDto();
        assertNull(accountTypeDto.getAccountTypeName());
    }

    @Test
    public void setAccountTypeName() {
        AccountTypeDto accountTypeDto = new AccountTypeDto();
        accountTypeDto.setAccountTypeName("accountTypeName");
    }

    @Test
    public void getCreationDate() {
        AccountTypeDto accountTypeDto = new AccountTypeDto();
        assertNull(accountTypeDto.getCreationDate());
    }

    @Test
    public void setCreationDate() {
        AccountTypeDto accountTypeDto = new AccountTypeDto();
        accountTypeDto.setCreationDate(LocalDate.now());
    }

    @Test
    public void getAccountType() {
        AccountTypeDto accountTypeDto = new AccountTypeDto();
        assertNotNull(accountTypeDto.getAccountType());
    }
}