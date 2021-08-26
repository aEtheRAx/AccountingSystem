package za.ac.nwu.as.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.as.domain.dto.AccountTypeDto;
import za.ac.nwu.as.logic.flow.CreateAccountTypeFlow;
import za.ac.nwu.as.translator.AccountTypeTranslator;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component("createAccountTypeFlowName")
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {

    private final AccountTranslator accountTranslator;

    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTranslator = accountTypeTranslator;
    }

    @Override
    public AccounttypeDto create(AccountTypeDto accountType){
        if (null ==accountType.getCreationData()){
            accountType.setCreationDate(LocalDate.now());
        }
        return accountTranslator.create(accountType);
    }
}
