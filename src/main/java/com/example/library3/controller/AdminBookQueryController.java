package com.example.library3.controller;

import com.example.library3.dto.BookStatusDTO;
import com.example.library3.dto.SearchCriteriaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/admin/books")
public class AdminBookQueryController {

    @PostMapping("/status")
    public ResponseEntity<List<BookStatusDTO>> queryAllBooksStatus(@RequestBody SearchCriteriaDTO searchCriteriaDTO) {
        // Implementation will be provided in the service layer
        return ResponseEntity.ok().build();
    }
}