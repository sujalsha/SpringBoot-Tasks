package com.personalfinancemanagement.personalfinancemanagement.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @JsonProperty("userId")
    private Long userId;

    @JsonProperty("transactionType")
    private String transactionType;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("category")
    private String category;

    @JsonProperty("date")
    private String date;

    @JsonProperty("notes")
    private String notes;

    public Transactions(Long transactionId, Long userId, String transactionType, String amount, String category, String date, String notes) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.notes = notes;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Transactions() {
    }
}

