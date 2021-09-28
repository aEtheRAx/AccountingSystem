package za.ac.nwu.as.translator;

import za.ac.nwu.as.domain.dto.AccountHolderDto;
import za.ac.nwu.as.domain.dto.AccountTransactionDto;
import za.ac.nwu.as.domain.persistence.AccountTransaction;

import java.util.List;

public interface AccountTransactionTranslator {

    AccountTransaction save(AccountTransaction accountTransaction);

    List<AccountTransaction> getAllAccountTransactions();

    AccountTransaction getAccountTransactionByPk(int transactionId);

    AccountTransactionDto create(AccountTransactionDto accountTransaction);
}
