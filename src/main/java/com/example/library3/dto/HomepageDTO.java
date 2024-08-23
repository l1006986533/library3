package com.example.library3.dto;

import java.util.List;
import java.util.Map;

import jakarta.validation.constraints.NotNull;

public class HomepageDTO {
    @NotNull
    private String operatingHours;
    @NotNull
    private String contactInformation;
    @NotNull
    private List<String> recentAnnouncements;
    @NotNull
    private Map<String, String> navigationLinks;

    // Constructor, getters, and setters assumed to exist
}