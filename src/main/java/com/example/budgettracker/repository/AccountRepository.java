package com.example.budgettracker.repository;

import com.example.budgettracker.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
