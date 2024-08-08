package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    // Simulated database access (for example purposes)
    public void save(String bookTitle) {
        System.out.println("Book saved: " + bookTitle);
    }
}
