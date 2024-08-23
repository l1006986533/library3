package com.example.library3.dto;

import jakarta.persistence.Entity; import jakarta.persistence.Id;

@Entity
public class BookStatusDTO {
    @Id
    private Long id; // unique identifier for the book status
    private String title; // title of the book
    private String author; // author of the book
    private String genre; // genre of the book
    private Integer totalCopies; // total number of copies available
    private Integer borrowedCopies; // number of copies currently borrowed
    private Integer overdueCopies; // number of overdue copies

    // Constructor, getters, and setters assumed to exist
}