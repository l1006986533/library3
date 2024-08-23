package com.example.library3.controller;

import com.example.library3.dto.TeacherDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin/teachers")
public class AdminTeacherRegistrationController {

    @PostMapping("/register")
    public ResponseEntity<String> registerTeacher(@Valid @RequestBody TeacherDTO teacherDTO) {
        // Logic to register the teacher using the service layer
        return ResponseEntity.ok("Teacher registered successfully");
    }
}