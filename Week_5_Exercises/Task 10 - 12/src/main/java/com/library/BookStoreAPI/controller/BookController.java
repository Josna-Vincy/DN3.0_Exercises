package com.library.BookStoreAPI.controller;

import com.library.BookStoreAPI.assembler.BookModelAssembler;
import com.library.BookStoreAPI.exception.ResourceNotFoundException;
import com.library.BookStoreAPI.model.Book;
import com.library.BookStoreAPI.model.BookModel;
import com.library.BookStoreAPI.repository.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepository;
    private final BookModelAssembler assembler;

    public BookController(BookRepository bookRepository, BookModelAssembler assembler) {
        this.bookRepository = bookRepository;
        this.assembler = assembler;
    }

    @GetMapping("/{id}")
    public EntityModel<BookModel> getBookById(@PathVariable Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found"));
        return EntityModel.of(assembler.toModel(book));
    }

    @GetMapping
    public CollectionModel<BookModel> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        List<BookModel> models = books.stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());
        return CollectionModel.of(models, linkTo(methodOn(BookController.class).getAllBooks()).withSelfRel());
    }
}
