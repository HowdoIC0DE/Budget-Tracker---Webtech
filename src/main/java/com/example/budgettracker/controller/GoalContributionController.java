package com.example.budgettracker.controller;

import com.example.budgettracker.model.GoalContribution;
import com.example.budgettracker.repository.GoalContributionRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class GoalContributionController {

    private final GoalContributionRepository goalContributionRepository;

    public GoalContributionController(GoalContributionRepository goalContributionRepository) {
        this.goalContributionRepository = goalContributionRepository;
    }

    @GetMapping("/goal-contributions")
    public List<GoalContribution> getGoalContributions() {
        return goalContributionRepository.findAll();
    }

    @PostMapping("/goal-contributions")
    public GoalContribution createGoalContribution(@RequestBody GoalContribution goalContribution) {
        return goalContributionRepository.save(goalContribution);
    }
}
