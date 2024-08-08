package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        System.out.println("Book service is performing.");
        // Example of using bookRepository
        bookRepository.findBooks();
    }
}
