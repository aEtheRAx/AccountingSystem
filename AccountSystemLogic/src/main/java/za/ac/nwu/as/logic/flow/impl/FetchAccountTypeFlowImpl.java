package za.ac.nwu.as.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.as.domain.dto.AccountTypeDto;
import za.ac.nwu.as.logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.as.translator.AccountTypeTranslator;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {

    private final AccountTypeTranslator accountTranslator;

    @Autowired
    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTranslator = accountTypeTranslator;
    }

    //@Override
    public List<AccountTypeDto> getAllAccountTypes(){
        return accountTranslator.getAllAccountTypes();
    }

}
