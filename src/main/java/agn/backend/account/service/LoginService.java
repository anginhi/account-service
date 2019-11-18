package agn.backend.account.service;

import agn.backend.account.model.LoginInfo;
import agn.backend.account.repository.LoginRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    public LoginService(@NonNull LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    public LoginInfo findById(String id){
        return loginRepository.findById(id).get();
    }
}
