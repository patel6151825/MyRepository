package com.johnabbott.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.library.model.Book;
import com.johnabbott.library.service.bookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	bookService service;
	
	//http://localhost:8080/LibrarySystem/books/getcomputerbooks
	@RequestMapping(value = "/getcomputerbooks", method = RequestMethod.GET)

	public ModelAndView getComputerBooksList() {

		ModelAndView modelView = new ModelAndView("book-list");

		List<Book> books = service.getComputerBooks();

		modelView.addObject("bookList", books);

		return modelView;

	}
	
	//http://localhost:8080/LibrarySystem/books/getnovelbooks
	@RequestMapping(value = "/getnovelbooks", method = RequestMethod.GET)

	public ModelAndView getNovelBooksList() {

		ModelAndView modelView = new ModelAndView("book-list");

		List<Book> books = service.getNovelBooks();

		modelView.addObject("bookList", books);

		return modelView;

	}
	
}
