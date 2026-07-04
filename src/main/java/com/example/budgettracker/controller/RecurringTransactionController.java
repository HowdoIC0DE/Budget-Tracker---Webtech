package com.example.budgettracker.controller;

import com.example.budgettracker.model.RecurringTransaction;
import com.example.budgettracker.repository.RecurringTransactionRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class RecurringTransactionController {

    private final RecurringTransactionRepository recurringTransactionRepository;

    public RecurringTransactionController(RecurringTransactionRepository recurringTransactionRepository) {
        this.recurringTransactionRepository = recurringTransactionRepository;
    }

    @GetMapping("/recurring-transactions")
    public List<RecurringTransaction> getRecurringTransactions() {
        return recurringTransactionRepository.findAll();
    }

    @PostMapping("/recurring-transactions")
    public RecurringTransaction createRecurringTransaction(@RequestBody RecurringTransaction recurringTransaction) {
        return recurringTransactionRepository.save(recurringTransaction);
    }
}
