package com.example.bookEstore.dao;

import java.util.List;

import com.example.bookEstore.model.Book;

public interface BookDao {
	List<Book> showAllBooks();
	List<Book> searchBookByName(String bookName);
	List<Book> searchBookByAuthor(String bookAuthor);
}
