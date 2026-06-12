package com.example.budgettracker.controller;

import com.example.budgettracker.model.Transaction;
import com.example.budgettracker.repository.TransactionRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TransactionController {

    private final TransactionRepository transactionRepository;

    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    @PostMapping("/transactions")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}