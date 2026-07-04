package com.example.budgettracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String categoryName;
    private double amount;
    private String period;

    public Budget() {
    }

    public Budget(Long id, String name, String categoryName, double amount, String period) {
        this.id = id;
        this.name = name;
        this.categoryName = categoryName;
        this.amount = amount;
        this.period = period;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public double getAmount() {
        return amount;
    }

    public String getPeriod() {
        return period;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
