package za.ac.nwu.as.domain.dto;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTransactionDetailsDtoTest {

    @Test
    public void getPartnerName() {
        AccountTransactionDetailsDto accountTransactionDetailsDto = new AccountTransactionDetailsDto();
        assertNull(accountTransactionDetailsDto.getPartnerName());
    }

    @Test
    public void setPartnerName() {
        AccountTransactionDetailsDto accountTransactionDetailsDto = new AccountTransactionDetailsDto();
        accountTransactionDetailsDto.setPartnerName("Test");
    }

    @Test
    public void getNumberOfItems() {
        AccountTransactionDetailsDto accountTransactionDetailsDto = new AccountTransactionDetailsDto();
        assertNull(accountTransactionDetailsDto.getNumberOfItems());
    }

    @Test
    public void setNumberOfItems() {
        AccountTransactionDetailsDto accountTransactionDetailsDto = new AccountTransactionDetailsDto();
        accountTransactionDetailsDto.setPartnerName("12L");
    }

    @Test
    public void buildAccountTransactionDetails() {

    }

    @Test
    public void testBuildAccountTransactionDetails() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testToString() {

    }
}