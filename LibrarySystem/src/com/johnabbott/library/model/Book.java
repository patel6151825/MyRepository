package com.johnabbott.library.model;

public class Book {
	private String bookName;
	private String author;
	private Integer numberOfPages;
	
	public Book() {
		super();
	}
	
	public Book(String bookName, String author, Integer numberOfPages) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	
}
