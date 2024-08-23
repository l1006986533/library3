package com.example.library3.dto;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class BookDTO {
    private String title;
    private String author;
    private String isbn;
    private String course;

    public BookDTO(String title, String author, String isbn, String course) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.course = course;
    }

    public BookDTO() {

    }
}