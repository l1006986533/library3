package com.example.library3.service;

import com.example.library3.dto.HomepageDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {
    public HomepageDTO fetchHomepageDetails() {
        // Business logic to fetch homepage details
        return new HomepageDTO();
    }

    public HomepageDTO getHomepageInfo() {
        //add by human
        return new HomepageDTO();
    }
}