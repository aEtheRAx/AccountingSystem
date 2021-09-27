package za.ac.nwu.as.domain.dto;

import org.junit.Test;
import za.ac.nwu.as.domain.persistence.AccountTransaction;
import za.ac.nwu.as.domain.persistence.AccountTransactionDetails;

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
        accountTransactionDetailsDto.setNumberOfItems(12L);
    }

    @Test
    public void buildAccountTransactionDetails() {
        AccountTransactionDetailsDto accountTransactionDetailsDto01 = new AccountTransactionDetailsDto("partnerName",12L);
        accountTransactionDetailsDto01.buildAccountTransactionDetails();
        AccountTransaction accountTransaction = new AccountTransaction();
        accountTransactionDetailsDto01.buildAccountTransactionDetails(accountTransaction);
    }

    @Test
    public void AccountTransactionDetailsDto() {
        AccountTransactionDetailsDto accountTransactionDetailsDto01 = new AccountTransactionDetailsDto("partnerName",12L);
        AccountTransactionDetails accountTransactionDetails = new AccountTransactionDetails();
        AccountTransactionDetailsDto accountTransactionDetailsDto02 = new AccountTransactionDetailsDto(accountTransactionDetails);
        accountTransactionDetailsDto01.toString();
        accountTransactionDetailsDto01.equals(accountTransactionDetailsDto02);
        accountTransactionDetailsDto01.hashCode();

    }
}