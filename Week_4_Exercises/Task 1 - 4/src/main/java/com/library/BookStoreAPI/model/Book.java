package com.library.BookStoreAPI.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Getter
    @Setter
    private Long id;
    private String title;
    private String author;
    private double price;
    private String isbn;
}

