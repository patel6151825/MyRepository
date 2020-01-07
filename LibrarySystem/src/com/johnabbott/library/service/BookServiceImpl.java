package com.johnabbott.library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.johnabbott.library.model.Book;

@Service
public class BookServiceImpl implements bookService{

	public List<Book> getComputerBooks() {
		
		List<Book> books = new ArrayList<Book>();

		books.add(new Book("HTML", "John Doe", 2000));
		books.add(new Book("CSS", "Alice Lopez", 2005));
		books.add(new Book("JavaScript", "Bob Corebeil", 2010));
		
		return books;
	}

	@Override
	public List<Book> getNovelBooks() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();

		books.add(new Book("The Ghost", "Paul brian", 2000));
		books.add(new Book("Kids story", "Alice Doe", 2005));
		books.add(new Book("Mahatma Gandhi", "Bob devin", 2010));
		
		return books;
	}
	
}
