package za.ac.nwu.as.domain.persistence;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ACCOUNT_TX_DETAILS", schema = "C##HEINKE")
public class AccountTransactionDetails implements Serializable {

    private static final long serialVersionUID = -6267449281814297055L;

    Long AccountTransactionDetailsId;
    AccountTransaction accountTransaction;
    String partnerName;
    Long numberOfItems;

    @Id
    @SequenceGenerator(name = "NWU_GENERIC_SEQ", sequenceName = "HR.NWU_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NWU_GENERIC_SEQ")
    @Column(name = "ACCOUNT_TX_DETAILS_ID")
    public Long getAccountTransactionDetailsId() {
        return AccountTransactionDetailsId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TX_ID")
    public AccountTransaction getAccountTransaction() {
        return accountTransaction;
    }

    @Column(name = "PARTNER_NAME")
    public String getPartnerName() {
        return partnerName;
    }

    @Column(name = "NUMBER_OF_ITEMS")
    public Long getNumberOfItems() {
        return numberOfItems;
    }

    public AccountTransactionDetails() {
    }

    public AccountTransactionDetails(AccountTransaction accountTransaction, String partnerName, Long numberOfItems) {
        this.accountTransaction = accountTransaction;
        this.partnerName = partnerName;
        this.numberOfItems = numberOfItems;
    }

    public AccountTransactionDetails(String partnerName, Long numberOfItems) {
        this.partnerName = partnerName;
        this.numberOfItems = numberOfItems;
    }

    public void setAccountTransactionDetailsId(Long accountTransactionDetailsId) {
        AccountTransactionDetailsId = accountTransactionDetailsId;
    }

    public void setAccountTransaction(AccountTransaction accountTransaction) {
        this.accountTransaction = accountTransaction;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public void setNumberOfItems(Long numberOfItems) {
        this.numberOfItems = numberOfItems;
    }


    public AccountTransactionDetails buildAccountTransactionDetails(AccountTransaction createdAccountTransaction) {
        return new AccountTransactionDetails(createdAccountTransaction, this.partnerName, this.numberOfItems);
    }
}
