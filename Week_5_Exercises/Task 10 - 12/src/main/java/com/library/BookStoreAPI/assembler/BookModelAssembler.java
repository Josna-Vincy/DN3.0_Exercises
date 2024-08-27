package com.library.BookStoreAPI.assembler;

import com.library.BookStoreAPI.controller.BookController;
import com.library.BookStoreAPI.model.Book;
import com.library.BookStoreAPI.model.BookModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class BookModelAssembler extends RepresentationModelAssemblerSupport<Book, BookModel> {

    public BookModelAssembler() {
        super(BookController.class, BookModel.class);
    }

    @Override
    public BookModel toModel(Book book) {
        BookModel model = instantiateModel(book);

        model.add(linkTo(methodOn(BookController.class).getBookById(book.getId())).withSelfRel());
        model.add(linkTo(methodOn(BookController.class).getAllBooks()).withRel("books"));
        // Add other relevant links

        model.setId(book.getId());
        model.setTitle(book.getTitle());
        model.setAuthor(book.getAuthor());
        model.setPrice(book.getPrice());
        model.setIsbn(book.getIsbn());

        return model;
    }
}
