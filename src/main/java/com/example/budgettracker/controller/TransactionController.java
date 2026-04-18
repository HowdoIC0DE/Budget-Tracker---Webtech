package com.example.budgettracker.controller;
import com.example.budgettracker.model.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TransactionController {

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return List.of(
                new Transaction(1L, "Miete", 650.0, "EXPENSE", "2026-04-01"),
                new Transaction(2L, "Gehalt", 1400.0, "INCOME", "2026-04-03"),
                new Transaction(3L, "Einkauf", 45.99, "EXPENSE", "2026-04-05")
        );
    }
}
