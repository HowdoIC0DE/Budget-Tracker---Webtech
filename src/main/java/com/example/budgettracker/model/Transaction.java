package com.example.budgettracker.model;

public class Transaction {
    private long id;
    private String title;
    private double amount;
    private String type;
    private String date;

    public Transaction(long id, String title, double amount, String type, String date) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public double getAmount() {
        return  amount;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }
}
