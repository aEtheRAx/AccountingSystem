package za.ac.nwu.as.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.as.domain.persistence.AccountHolder;
import java.time.LocalDate;

@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolder, Long> {

    @Query(value = "SELECT " +
            "       MEMBER_ID, " +
            "       MEMBER_NAME, " +
            "       BALANCE, " +
            "       CURRENCY, " +
            "       START_DATE" +
            "       FROM " +
            "       C##HEINKE.ACCOUNT_HOLDER "+
            "       WHERE MEMBER_ID = :memberId ", nativeQuery = true)
    AccountHolder getAccountHolderByIDNativeQuery(int memberId);

    @Query(value = "SELECT " +
            "       at" +
            "       FROM " +
            "       AccountHolder at" +
            "       WHERE   at.memberId = :memberId ")
    AccountHolder getAccountHolderByID(int memberId);

    //Update statement
    @Query(value = "UPDATE " +
            "       C##HEINKE.ACCOUNT_HOLDER " +
            "       SET BALANCE = :newAccountBalance," +
            "       CURRENCY = :newAccountCurrency," +
            "       MEMBER_NAME = :newAccountName," +
            "       START_DATE = :newAccountCreationDate" +
            "       WHERE MEMBER_NAME = :newAccountName", nativeQuery = true)
    AccountHolder updateAccountHolderByIDNativeQuery(String newAccountName, String newAccountCurrency, int newAccountBalance,  LocalDate newAccountCreationDate);

    //Add miles (update) statement
    @Query(value = "UPDATE " +
            "       C##HEINKE.ACCOUNT_HOLDER " +
            "       SET BALANCE = :newAccountBalance" +
            "       WHERE MEMBER_ID = :memberId", nativeQuery = true)
    AccountHolder addMilesByIDNativeQuery(int memberId, int newAccountBalance);

    //Subtract miles (update) statement
    @Query(value = "UPDATE " +
            "       C##HEINKE.ACCOUNT_HOLDER " +
            "       SET BALANCE = :newAccountBalance" +
            "       WHERE MEMBER_ID = :memberId", nativeQuery = true)
    AccountHolder subtractMilesByIDNativeQuery(int memberId, int newAccountBalance);
}
