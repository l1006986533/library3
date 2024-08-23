package com.example.library3.dto;

import jakarta.persistence.Entity; import jakarta.persistence.Id;

@Entity
public class StudentDTO {
    @Id
    private String studentId;
    private String name;
    private String className;
    private String contactInformation;

    // Constructor
    public StudentDTO(String studentId, String name, String className, String contactInformation) {
        this.studentId = studentId;
        this.name = name;
        this.className = className;
        this.contactInformation = contactInformation;
    }

    // Getters and Setters (assumed to exist)
}