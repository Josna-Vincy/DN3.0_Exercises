package com.library.BookStoreAPI.model;

import lombok.*;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    // Getters and setters
    private Long id;
    private String title;
    private String author;
    private Long getPrice;
    @Setter
    private String isbn;

    public Long getPrice() {
        return 0L;
    }
}
