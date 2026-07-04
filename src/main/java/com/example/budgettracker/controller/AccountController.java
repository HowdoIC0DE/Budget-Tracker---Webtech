package com.example.budgettracker.controller;

import com.example.budgettracker.model.Account;
import com.example.budgettracker.repository.AccountRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @PostMapping("/accounts")
    public Account createAccount(@RequestBody Account account) {
        return accountRepository.save(account);
    }
}
