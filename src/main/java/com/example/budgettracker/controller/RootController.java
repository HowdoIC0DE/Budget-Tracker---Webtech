package com.example.budgettracker.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
public class RootController {

    @GetMapping("/")
    public Map<String, Object> getApiInfo() {
        return Map.of(
                "message", "Budget Tracker Backend API is running",
                "endpoints", List.of(
                        "/transactions",
                        "/categories",
                        "/accounts",
                        "/budgets",
                        "/budget-periods",
                        "/recurring-transactions",
                        "/saving-goals",
                        "/payment-methods",
                        "/merchants",
                        "/transaction-notes"
                )
        );
    }
}
