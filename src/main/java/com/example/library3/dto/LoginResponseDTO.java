package com.example.library3.dto;

import jakarta.persistence.Entity;

@Entity
public class LoginResponseDTO {
    private String message;
    private String redirectUrl;

    public LoginResponseDTO(String message, String redirectUrl) {
        this.message = message;
        this.redirectUrl = redirectUrl;
    }

    public LoginResponseDTO() {}
}