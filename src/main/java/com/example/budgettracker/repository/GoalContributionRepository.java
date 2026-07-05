package com.example.budgettracker.repository;

import com.example.budgettracker.model.GoalContribution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalContributionRepository extends JpaRepository<GoalContribution, Long> {
}
