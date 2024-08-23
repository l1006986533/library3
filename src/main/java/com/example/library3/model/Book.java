package com.example.library3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private String course;

    public Book() {}

    public Book(Long id, String title, String author, String isbn, String course) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.course = course;
    }

    // Getters and Setters assumed to exist
}