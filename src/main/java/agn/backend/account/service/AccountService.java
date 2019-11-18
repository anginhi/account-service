package agn.backend.account.service;

import agn.backend.account.model.Profile;
import agn.backend.account.repository.AccountRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService (@NonNull AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public Profile getProfileById(String id){
        return accountRepository.getOne(id);
    }
}
