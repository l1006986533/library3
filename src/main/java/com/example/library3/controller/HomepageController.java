package com.example.library3.controller;

import com.example.library3.dto.HomepageDTO;
import com.example.library3.service.HomepageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/homepage")
public class HomepageController {

    @Autowired
    private HomepageService homepageService;

    @GetMapping("/info")
    public ResponseEntity<HomepageDTO> getHomepageInfo() {
        HomepageDTO homepageInfo = homepageService.getHomepageInfo();
        return ResponseEntity.ok(homepageInfo);
    }
}