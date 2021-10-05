package za.ac.nwu.as.logic.flow.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.ac.nwu.as.domain.dto.AccountHolderDto;
import za.ac.nwu.as.logic.flow.CreateAccountHolderFlow;
import za.ac.nwu.as.translator.AccountHolderTranslator;
import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component("createAccountHolderFlowName")
public class CreateAccountHolderFlowImpl implements CreateAccountHolderFlow {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateAccountHolderFlowImpl.class);

    private final AccountHolderTranslator accountHolderTranslator;

    public CreateAccountHolderFlowImpl(AccountHolderTranslator accountHolderTranslator) {
        this.accountHolderTranslator = accountHolderTranslator;
    }

    @Override
    public AccountHolderDto create(AccountHolderDto accountHolder) {

        if(LOGGER.isInfoEnabled()) {
            String outputForLogging = "null";
            if ((null != accountHolder) && (null != accountHolder.getAccountHolder())) {
                outputForLogging = accountHolder.getAccountHolder().toString();
            }
            LOGGER.info("The input is {} and the Details is {}", accountHolder, outputForLogging);
        }

        //Prev code
        if (null == accountHolder.getStartDate()){
            accountHolder.setStartDate(LocalDate.now());
        }
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Got AccountHolder for {} and the AccountHolderId is {}", accountHolder.getMemberName(), accountHolder.getAccountHolder().getMemberId());
        }
        LOGGER.info("The return object is {}", accountHolder.getAccountHolder());
        return accountHolderTranslator.create(accountHolder);
    }
}
