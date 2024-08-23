package com.example.library3.controller;

import com.example.library3.repository.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class AdminBookDeleteController {

    @Autowired
    private BookRepository bookRepository;

    @DeleteMapping("/books/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        // Logic to delete the book by bookId
        // Assuming bookRepository has a method to delete by ID
        if (bookRepository.existsById(bookId)) {
            bookRepository.deleteById(bookId);
            return ResponseEntity.ok("Book deleted successfully.");
        } else {
            return ResponseEntity.status(404).body("Book not found.");
        }
    }
}