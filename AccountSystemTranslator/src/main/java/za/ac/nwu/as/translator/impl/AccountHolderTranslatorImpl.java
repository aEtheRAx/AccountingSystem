package za.ac.nwu.as.translator.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.as.domain.dto.AccountHolderDto;
import za.ac.nwu.as.domain.persistence.AccountHolder;
import za.ac.nwu.as.repo.persistence.AccountHolderRepository;
import za.ac.nwu.as.translator.AccountHolderTranslator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountHolderTranslatorImpl implements AccountHolderTranslator {

    private final AccountHolderRepository repo;

    public AccountHolderTranslatorImpl(AccountHolderRepository accountHolderRepository){
        this.repo = accountHolderRepository;
    }

    @Override
    public AccountHolder save(AccountHolder accountHolder) {
        try {
            return repo.save(accountHolder);
        } catch (Exception e) {
            throw new RuntimeException("Unable to save to the DB", e);
        }
    }

    @Override
    public List<AccountHolder> getAllAccountHolders() {
        List<AccountHolder> accountHolders;
        try {
            accountHolders = new ArrayList<>(repo.findAll());
        } catch (Exception e) {
            throw new RuntimeException("Unable to read to the DB", e);
        }
        return accountHolders;
    }

    @Override
    public AccountHolderDto create(AccountHolderDto accountHolderDto) {
        try {
            AccountHolder accountHolder = repo.save(accountHolderDto.getAccountHolder());
            return new AccountHolderDto(accountHolder);
        } catch (Exception e) {
            throw new RuntimeException("Unable to read from the DB", e);
        }
    }

    @Override
    public AccountHolderDto updateAccountHolder(String memberName, int newAccountBalance, String newAccountCurrency, LocalDate newAccountStartDate) {
        try {
            AccountHolder accountHolder = repo.getAccountHolderByName(memberName);
            //AccountHolder accountHolder = repo.updateAccountHolderByIDNativeQuery(memberName, newAccountCurrency,newAccountBalance,  newAccountStartDate);
            accountHolder.setMemberName(memberName);
            accountHolder.setBalance(newAccountBalance);
            accountHolder.setCurrency(newAccountCurrency);
            accountHolder.setStartDate(newAccountStartDate);
            repo.save(accountHolder);
            return new AccountHolderDto(accountHolder);
        } catch (Exception e) {
            throw new RuntimeException("Unable to update the DB", e);
        }
    }

    @Override
    public AccountHolderDto addMiles(int memberId, int newAccountBalance){
        try {
            AccountHolder accountHolder = repo.getAccountHolderByIDNativeQuery(memberId);
            accountHolder.setBalance(accountHolder.getBalance() + newAccountBalance);
            repo.save(accountHolder);
            return new AccountHolderDto(accountHolder);
        } catch (Exception e) {
            throw new RuntimeException("Unable to add currency the DB", e);
        }
    }

    @Override
    public AccountHolderDto subtractMiles(int memberId, int newAccountBalance) {
        try {
            AccountHolder accountHolder = repo.getAccountHolderByIDNativeQuery(memberId);
            accountHolder.setBalance(accountHolder.getBalance() - newAccountBalance);
            repo.save(accountHolder);
            return new AccountHolderDto(accountHolder);
        } catch (Exception e) {
            throw new RuntimeException("Unable to subtract currency the DB", e);
        }
    }

    @Override
    public AccountHolderDto getAccountHolderByIDNativeQuery(int memberId) {
        try {
            AccountHolder accountHolder = repo.getAccountHolderByIDNativeQuery(memberId);
            return new AccountHolderDto(accountHolder);
        } catch (Exception e) {
            throw new RuntimeException("Unable to read from the DB", e);
        }
    }
}
