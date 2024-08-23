package com.example.library3.controller;

import com.example.library3.dto.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.*;

@RestController
@RequestMapping("/admin/books")
public class AdminBookAddController {

    @PostMapping("/add")
    public ResponseEntity<String> addNewBook(@RequestBody BookDTO bookDTO) {
        // Logic to add a new book using bookDTO
        return ResponseEntity.ok("Book added successfully");
    }
}