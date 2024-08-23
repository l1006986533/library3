package com.example.library3.service;

import com.example.library3.dto.BookDTO;
import com.example.library3.model.Book;
import com.example.library3.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AdminBookModifyService {

    @Autowired
    private BookRepository bookRepository;

    public void updateBookDetails(Long bookId, BookDTO bookDTO) {
        // Fetch the book from the repository
        Book book = bookRepository.findById(bookId);
//            .orElseThrow(() -> new RuntimeException("Book not found"));  // comment by human

        // Update book details
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setIsbn(bookDTO.getIsbn());
        book.setCourse(bookDTO.getCourse());

        // Save the updated book back to the repository
        bookRepository.save(book);
    }
}