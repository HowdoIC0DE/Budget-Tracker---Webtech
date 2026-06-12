package com.example.budgettracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private double amount;
    private String type;
    private String date;

    public Transaction() {
    }

    public Transaction(Long id, String title, double amount, String type, String date) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.type = type;
        this.date = date;
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

    public String getDate() {
        return date;
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

    public void setDate(String date) {
        this.date = date;
    }
}