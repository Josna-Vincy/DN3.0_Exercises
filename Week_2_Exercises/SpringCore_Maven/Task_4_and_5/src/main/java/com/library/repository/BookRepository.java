package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository("bookRepository")
public class BookRepository {
    public void findBooks() {
        System.out.println("Finding books in the repository.");
    }
}
