package za.ac.nwu.as.logic.flow.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.ac.nwu.as.domain.dto.AccountTypeDto;
import za.ac.nwu.as.logic.flow.CreateAccountTypeFlow;
import za.ac.nwu.as.translator.AccountTypeTranslator;
import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component("createAccountTypeFlowName")
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateAccountTypeFlowImpl.class);
    private final AccountTypeTranslator accountTranslator;

    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTranslator = accountTypeTranslator;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountType){

        if(LOGGER.isInfoEnabled()) {
            String outputForLogging = "null";
            if ((null != accountType) && (null != accountType.getMnemonic())) {
                outputForLogging = accountType.getAccountType().toString();
            }
            LOGGER.info("The input is {} and the Details is {}", accountType, outputForLogging);
        }

        if (null == accountType.getCreationDate()){
            accountType.setCreationDate(LocalDate.now());
        }

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Got AccountType for {} and the AccountType Mnemonic is {}", accountType.getAccountType(), accountType.getMnemonic());
        }
        LOGGER.info("The return object is {}", accountType.getAccountType());

        return accountTranslator.create(accountType);
    }
}
