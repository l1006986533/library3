package com.example.library3.controller;

import com.example.library3.dto.LoginResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin")
public class AdminLoginController {

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> adminLogin(@RequestParam String username, @RequestParam String password) {
        // Logic for authenticating admin and returning response
        return ResponseEntity.ok(new LoginResponseDTO()); // Placeholder response
    }
}