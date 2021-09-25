package za.ac.nwu.as.domain.dto;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class AccountHolderDtoTest {

    @Test
    public void getMemberName() {
        AccountHolderDto accountHolderDto = new AccountHolderDto();
        assertNull(accountHolderDto.getMemberName());
    }

    /*
    @Test
    public void getBalance() {
        AccountHolderDto accountHolderDto = new AccountHolderDto();
        assert(accountHolderDto.getBalance());
    }*/

    @Test
    public void getCurrency() {
        AccountHolderDto accountHolderDto = new AccountHolderDto();
        assertNull(accountHolderDto.getCurrency());
    }

    @Test
    public void getStartDate() {
        AccountHolderDto accountHolderDto = new AccountHolderDto();
        assertNull(accountHolderDto.getStartDate());
    }

    @Test
    public void setMemberName(){
        AccountHolderDto accountHolderDto = new AccountHolderDto();
        accountHolderDto.setMemberName("John");
    }

    @Test
    public void setBalance(){
        AccountHolderDto accountHolderDto = new AccountHolderDto();
        accountHolderDto.setBalance(1000);
    }

    @Test
    public void setCurrency(){
        AccountHolderDto accountHolderDto = new AccountHolderDto();
        accountHolderDto.setCurrency("MILES");
    }
    @Test
    public void setStartDate(){
        AccountHolderDto accountHolderDto = new AccountHolderDto();
        accountHolderDto.setStartDate(LocalDate.now());
    }

}