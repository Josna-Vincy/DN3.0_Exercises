package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.LibraryService;
import com.library.model.Book;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Obtain a bean and call methods to test logging aspect
        LibraryService libraryService = context.getBean(LibraryService.class);
        libraryService.addBook(new Book("The Great Gatsby"));
    }
}
