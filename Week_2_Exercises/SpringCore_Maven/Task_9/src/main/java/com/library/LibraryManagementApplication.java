package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

@SpringBootApplication
public class LibraryManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);

		// Load the Spring context from the XML configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the BookService bean from the context
		BookService bookService = (BookService) context.getBean("bookService");

		// Call a method on the BookService bean to test the configuration
		bookService.performService();
	}
}
