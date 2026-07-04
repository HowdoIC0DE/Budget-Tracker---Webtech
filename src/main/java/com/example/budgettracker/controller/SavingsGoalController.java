package com.example.budgettracker.controller;

import com.example.budgettracker.model.SavingsGoal;
import com.example.budgettracker.repository.SavingsGoalRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class SavingsGoalController {

    private final SavingsGoalRepository savingsGoalRepository;

    public SavingsGoalController(SavingsGoalRepository savingsGoalRepository) {
        this.savingsGoalRepository = savingsGoalRepository;
    }

    @GetMapping("/saving-goals")
    public List<SavingsGoal> getSavingsGoals() {
        return savingsGoalRepository.findAll();
    }

    @PostMapping("/saving-goals")
    public SavingsGoal createSavingsGoal(@RequestBody SavingsGoal savingsGoal) {
        return savingsGoalRepository.save(savingsGoal);
    }
}
