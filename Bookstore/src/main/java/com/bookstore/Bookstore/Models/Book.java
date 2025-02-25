package com.bookstore.Bookstore.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("author")
    private String author;
    @JsonProperty("publishingDate")
    private String publishingDate;
    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("edition")
    private String edition;
    @JsonProperty("category")
    private String category;
    @JsonProperty("language")
    private String language;
    @JsonProperty("format")
    private String format;
    @JsonProperty("synopsis")
    private String synopsis;
    @JsonProperty("rating")
    private double rating;
    @JsonProperty("price")
    private double price;

    public Book() {
    }

    public Book(Long id, String title, String author, String publishingDate, String publisher, String edition, String category, String language, String format, String synopsis, double rating, double price) {
        Id = id;
        this.title = title;
        this.author = author;
        this.publishingDate = publishingDate;
        this.publisher = publisher;
        this.edition = edition;
        this.category = category;
        this.language = language;
        this.format = format;
        this.synopsis = synopsis;
        this.rating = rating;
        this.price = price;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(String publishingDate) {
        this.publishingDate = publishingDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
