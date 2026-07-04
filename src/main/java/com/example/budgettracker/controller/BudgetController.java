package com.example.budgettracker.controller;

import com.example.budgettracker.model.Budget;
import com.example.budgettracker.repository.BudgetRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class BudgetController {

    private final BudgetRepository budgetRepository;

    public BudgetController(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @GetMapping("/budgets")
    public List<Budget> getBudgets() {
        return budgetRepository.findAll();
    }

    @PostMapping("/budgets")
    public Budget createBudget(@RequestBody Budget budget) {
        return budgetRepository.save(budget);
    }
}
