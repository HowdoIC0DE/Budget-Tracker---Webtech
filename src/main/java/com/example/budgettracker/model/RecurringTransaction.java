package com.example.budgettracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RecurringTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private double amount;
    private String type;
    private String frequency;
    private String nextDate;

    public RecurringTransaction() {
    }

    public RecurringTransaction(Long id, String title, double amount, String type, String frequency, String nextDate) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.type = type;
        this.frequency = frequency;
        this.nextDate = nextDate;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getNextDate() {
        return nextDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setNextDate(String nextDate) {
        this.nextDate = nextDate;
    }
}
