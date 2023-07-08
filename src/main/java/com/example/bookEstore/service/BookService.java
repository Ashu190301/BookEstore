package com.example.bookEstore.service;

import java.util.List;

import com.example.bookEstore.model.Book;

public interface BookService {
	List<Book> showAllBooks();
	List<Book> searchBookByName(String bookName);
	List<Book> searchBookByAuthor(String bookAuthor);
}
