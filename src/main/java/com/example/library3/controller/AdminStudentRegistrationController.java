package com.example.library3.controller;

import com.example.library3.dto.StudentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin/students")
public class AdminStudentRegistrationController {

    /**
     * Handles the registration of a new student.
     * 
     * @param studentDTO the data transfer object containing student information
     * @return ResponseEntity with a message indicating success or failure
     */
    @PostMapping("/register")
    public ResponseEntity<String> registerStudent(@Valid @RequestBody StudentDTO studentDTO) {
        // Implementation of student registration logic goes here.
        return ResponseEntity.ok("Student registered successfully.");
    }
}