package com.thucchien02.accountservice.controller;

import com.thucchien02.accountservice.model.AccountDTO;
import com.thucchien02.accountservice.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/accounts")
@Slf4j
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping(value = "/checkBalance/{id}")
    public Mono<AccountDTO> checkBalance(@PathVariable String id) {
        return accountService.checkBalance(id);
    }
}
