package com.example.budgettracker.repository;

import com.example.budgettracker.model.TransactionNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionNoteRepository extends JpaRepository<TransactionNote, Long> {
}
