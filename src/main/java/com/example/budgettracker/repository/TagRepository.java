package com.example.budgettracker.repository;

import com.example.budgettracker.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
