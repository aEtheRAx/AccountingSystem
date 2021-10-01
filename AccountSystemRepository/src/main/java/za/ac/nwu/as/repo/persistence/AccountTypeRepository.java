package za.ac.nwu.as.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.nwu.as.domain.dto.AccountTypeDto;
import za.ac.nwu.as.domain.persistence.AccountType;

import java.time.LocalDate;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {

    @Query(value = "SELECT " +
            "       ACCOUNT_TYPE_ID, " +
            "       ACCOUNT_TYPE_NAME, " +
            "       CREATION_DATE, " +
            "       MNEMONIC" +
            "       FROM " +
            "           C##HEINKE.ACCOUNT_TYPE "+
            "       WHERE MNEMONIC = :mnemonic ", nativeQuery = true)
    AccountType getAccountTypeByMnemonicNativeQuery(String mnemonic);

    @Query(value = "SELECT " +
            "       at" +
            "       FROM " +
            "       AccountType at" +
            "       WHERE   at.mnemonic = :mnemonic ")
    AccountType getAccountTypeByMnemonic(String mnemonic);

    @Query(value = "SELECT new za.ac.nwu.as.domain.dto.AccountTypeDto( " +
            "       at.mnemonic, "  +
            "       at.accountTypeName, "   +
            "       at.creationDate )"  +
            "       FROM "  +
            "       AccountType at" +
            "       WHERE at.mnemonic = :mnemonic ")
    AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic);

    //Delete statement
    @Query(value = "DELETE " +
            "       FROM " +
            "       AccountType at" +
            "       WHERE at.mnemonic = :mnemonic ")
    void deleteAccountTypeByMnemonic(String mnemonic);

    @Query(value = "UPDATE AccountType at" +
            "       SET at.accountTypeName = :newAccountTypeName, "   +
            "       at.creationDate = :newCreationDate "  +
            "       WHERE at.mnemonic = :mnemonic")
    AccountType updateAccountTypeByMnemonicNativeQuery(@Param("mnemonic") String mnemonic, @Param("newAccountTypeName") String newAccountTypeName, @Param("newCreationDate")  LocalDate newCreationDate);

}
