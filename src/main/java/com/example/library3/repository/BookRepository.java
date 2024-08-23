package com.example.library3.repository;

import com.example.library3.model.Book;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BookRepository {
    public void save(Book book) {
        // Implementation for saving all books to the database
    }
    public boolean existsById(Long id) {
        // add by human
        return false;
    }
    public boolean deleteById(Long id) {
        // add by human
        return false;
    }
    public Book findById(Long id) {
        // add by human
        return new Book();
    }
}