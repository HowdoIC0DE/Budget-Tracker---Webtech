package com.example.budgettracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TransactionNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long transactionId;
    private String text;
    private String createdDate;

    public TransactionNote() {
    }

    public TransactionNote(Long id, Long transactionId, String text, String createdDate) {
        this.id = id;
        this.transactionId = transactionId;
        this.text = text;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public String getText() {
        return text;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
