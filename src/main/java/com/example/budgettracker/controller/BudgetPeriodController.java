package com.example.budgettracker.controller;

import com.example.budgettracker.model.BudgetPeriod;
import com.example.budgettracker.repository.BudgetPeriodRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class BudgetPeriodController {

    private final BudgetPeriodRepository budgetPeriodRepository;

    public BudgetPeriodController(BudgetPeriodRepository budgetPeriodRepository) {
        this.budgetPeriodRepository = budgetPeriodRepository;
    }

    @GetMapping("/budget-periods")
    public List<BudgetPeriod> getBudgetPeriods() {
        return budgetPeriodRepository.findAll();
    }

    @PostMapping("/budget-periods")
    public BudgetPeriod createBudgetPeriod(@RequestBody BudgetPeriod budgetPeriod) {
        return budgetPeriodRepository.save(budgetPeriod);
    }
}
