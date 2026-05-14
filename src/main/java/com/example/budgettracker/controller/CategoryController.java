package com.example.budgettracker.controller;

import com.example.budgettracker.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return List.of(
                new Category(1L, "Miete", "EXPENSE"),
                new Category(2L, "Lebensmittel", "EXPENSE"),
                new Category(3L, "Gehalt", "INCOME")
        );
    }
}
