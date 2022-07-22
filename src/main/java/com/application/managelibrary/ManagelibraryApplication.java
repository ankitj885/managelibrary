package com.application.managelibrary;

import com.application.managelibrary.entity.Author;
import com.application.managelibrary.entity.Book;
import com.application.managelibrary.entity.Category;
import com.application.managelibrary.entity.Publisher;
import com.application.managelibrary.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagelibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagelibraryApplication.class, args);
	}

	//setting up dummy data for the project
	@Bean
	public CommandLineRunner initialCreate(BookService bookService){
		return (args) -> {
			Book book1 = new Book("ANC", "Book Name","My First Book");
			Author author1 = new Author("Test Name1", "Test description1");
			Category category1 = new Category("Business Books");
			Publisher publisher1 = new Publisher("First Publisher");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.createBook(book1);

			Book book2 = new Book("ANC1", "Book Name1","My Second Book");
			Author author2 = new Author("Test Name2", "Test description2");
			Category category2 = new Category("Science Books");
			Publisher publisher2 = new Publisher("Second Publisher");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.createBook(book2);

			Book book3 = new Book("ANC2", "Book Name2","My Third Book");
			Author author3 = new Author("Test Name3", "Test description3");
			Category category3 = new Category("Art Books");
			Publisher publisher3 = new Publisher("Third Publisher");
			book3.addAuthor(author3);
			book3.addCategory(category3);
			book3.addPublisher(publisher3);
			bookService.createBook(book3);
		};
	}
}
