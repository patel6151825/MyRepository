package com.johnabbott.library.service;

import java.util.List;

import com.johnabbott.library.model.Book;

public interface bookService {
	public List<Book> getComputerBooks();
	
	public List<Book> getNovelBooks();
}
