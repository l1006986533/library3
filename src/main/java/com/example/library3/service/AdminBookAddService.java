package com.example.library3.service;

import com.example.library3.dto.BookDTO;
import com.example.library3.model.Book;
import com.example.library3.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminBookAddService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public void saveNewBook(BookDTO bookDTO) {
        Book book = new Book();
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setIsbn(bookDTO.getIsbn());
        book.setCourse(bookDTO.getCourse());
        bookRepository.save(book);
    }
}