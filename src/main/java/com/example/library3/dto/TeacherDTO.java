package com.example.library3.dto;

import jakarta.persistence.Entity; import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TeacherDTO {
    @Id
    private String employeeId; //confidential
    private String name;
    private String department;
    private String contactInformation;
    private String Username; //add by human
    private String Password; //add by human
    private String Role;

    // Getters and Setters (assumed to exist)
}