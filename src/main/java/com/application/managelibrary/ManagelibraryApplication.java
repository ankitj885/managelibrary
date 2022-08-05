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
			Book book1 = new Book("978-93-5019-561-1", "Introduction to Computer","Junior Level Books");
			Author author1 = new Author("Amit Garg", "Test description1");
			Category category1 = new Category("Computer Books");
			Publisher publisher1 = new Publisher("Reader's Zone");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.createBook(book1);

			Book book2 = new Book("975-93-5353-364-1", "Computer Networks","For info on C/N");
			Author author2 = new Author("Saurabh Singhal", "Test description2");
			Category category2 = new Category("Network Books");
			Publisher publisher2 = new Publisher("Thakur Publications");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.createBook(book2);

			Book book3 = new Book("0-312-86624-0", "The Dark Beyond the Stars","Story of generation ship");
			Author author3 = new Author("Frank M. Robinson", "Test description3");
			Category category3 = new Category("Science fiction");
			Publisher publisher3 = new Publisher("Orb Books");
			book3.addAuthor(author3);
			book3.addCategory(category3);
			book3.addPublisher(publisher3);
			bookService.createBook(book3);
		};
	}
}
