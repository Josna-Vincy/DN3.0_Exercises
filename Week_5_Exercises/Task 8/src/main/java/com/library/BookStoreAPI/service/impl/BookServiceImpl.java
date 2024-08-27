package com.library.BookStoreAPI.service.impl;

import com.library.BookStoreAPI.model.Book;
import com.library.BookStoreAPI.service.BookService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private Map<Long, Book> bookStorage = new HashMap<>();
    private Long currentId = 1L;

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(bookStorage.get(id));
    }

    @Override
    public Book save(Book book) {
        book.setId(currentId++);
        bookStorage.put(book.getId(), book);
        return book;
    }

    @Override
    public List<Book> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }
}
