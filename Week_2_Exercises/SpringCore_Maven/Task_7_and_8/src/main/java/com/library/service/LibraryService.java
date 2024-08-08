package com.library.service;

import org.springframework.stereotype.Service;
import com.library.model.Book;

@Service
public class LibraryService {
    public void addBook(Book book) {
        // Implementation of adding a book
        System.out.println("Book added: " + book);
    }
}