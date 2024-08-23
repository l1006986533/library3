package com.example.library3.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRoleDTO {
    private String role;
    private String redirectUrl;

    public UserRoleDTO() {}

    public UserRoleDTO(String role, String redirectUrl) {
        this.role = role;
        this.redirectUrl = redirectUrl;
    }

    // Getters and Setters assumed to exist
}