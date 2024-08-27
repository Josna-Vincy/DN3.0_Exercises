package com.library.BookStoreAPI.service;

import com.library.BookStoreAPI.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<Book> findById(Long id);
    Book save(Book book);
    List<Book> findAll();
    void deleteById(Long id);


}
