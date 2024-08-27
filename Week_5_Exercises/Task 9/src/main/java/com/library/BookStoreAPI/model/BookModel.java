package com.library.BookStoreAPI.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@Setter
@Getter
public class BookModel extends RepresentationModel<BookModel> {
    private Long id;
    private String title;
    private String author;
    private Long price;
    private String isbn;

}
