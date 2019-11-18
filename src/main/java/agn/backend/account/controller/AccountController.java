package agn.backend.account.controller;

import agn.backend.account.model.LoginInfo;
import agn.backend.account.model.Profile;
import agn.backend.account.service.AccountService;
import agn.backend.account.service.LoginService;
import lombok.NonNull;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;

    private final LoginService loginService;

    public AccountController(@NonNull AccountService accountService, @NonNull LoginService loginService ){
        this.accountService = accountService;
        this.loginService = loginService;
    }


    @GetMapping("getProfile")
    public Profile getById(@Param("id") String id){
        return accountService.getProfileById(id);
    }

    @GetMapping("getLoginInfo")
    public LoginInfo getByLoginInfo(@Param("id") String id){
        return loginService.findById(id);
    }
}
