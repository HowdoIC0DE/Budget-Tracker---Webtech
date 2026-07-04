package com.example.budgettracker.repository;

import com.example.budgettracker.model.BudgetPeriod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetPeriodRepository extends JpaRepository<BudgetPeriod, Long> {
}
