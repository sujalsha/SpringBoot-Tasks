package com.financemanagement.PFMS.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    @JsonProperty("userId")
    private Long userId;
    @JsonProperty("transactionType")
    private String transactionType; // Income or Expense
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("category")
    private String category;
    @JsonProperty("notes")
    private String notes;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDateTime = new Date();

    public Transactions() {
    }

    public Transactions(Long transactionId, Long userId, String transactionType, Double amount, String category, String notes, Date transactionDateTime) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.category = category;
        this.notes = notes;
        this.transactionDateTime = transactionDateTime;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(Date transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }
}
