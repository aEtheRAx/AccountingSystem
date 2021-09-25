package za.ac.nwu.as.domain.persistence;

import org.junit.Test;
import za.ac.nwu.as.domain.dto.AccountTransactionDetailsDto;

import static org.junit.Assert.*;

public class AccountTransactionDetailsTest {

    @Test
    public void getAccountTransactionDetailsId() {
    }

    @Test
    public void getAccountTransaction() {
    }

    @Test
    public void getPartnerName() {
        AccountTransactionDetails accountTransactionDetails = new AccountTransactionDetails();
        assertNull(accountTransactionDetails.getPartnerName());
    }

    @Test
    public void getNumberOfItems() {
        AccountTransactionDetails accountTransactionDetails = new AccountTransactionDetails();
        assertNull(accountTransactionDetails.getNumberOfItems());
    }

    @Test
    public void setAccountTransactionDetailsId() {
    }

    @Test
    public void setAccountTransaction() {
    }

    @Test
    public void setPartnerName() {
        AccountTransactionDetails accountTransactionDetails = new AccountTransactionDetails();
        accountTransactionDetails.setPartnerName("Test");
    }

    @Test
    public void setNumberOfItems() {
        AccountTransactionDetails accountTransactionDetails = new AccountTransactionDetails();
        accountTransactionDetails.setPartnerName("12L");
    }
}