package com.example.library3.controller;

import com.example.library3.dto.LoginResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/student/login")
public class StudentLoginController {

    /**
     * Handles login requests for students and directs them to their functional interface upon successful authentication.
     * @param username the username of the student
     * @param password the password of the student //sensitive
     * @return ResponseEntity containing LoginResponseDTO with login result
     */
    @PostMapping
    public ResponseEntity<LoginResponseDTO> studentLogin(@Valid @RequestParam String username, @Valid @RequestParam String password) {
        // Implementation of login logic goes here
        return null; // Placeholder return statement
    }
}