package com.example.bookEstore.service;

import java.util.List;
import java.util.ArrayList;

import com.example.bookEstore.dao.BookDao;
import com.example.bookEstore.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	@Autowired
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> searchBookByName(String bookName) {

		List<Book> books = bookDao.searchBookByName(bookName);

		List<Book> rsBookSet = new ArrayList<>();
		for (Book record : books) {
			if (record.getName().toLowerCase().contains(bookName.toLowerCase())) {
				rsBookSet.add(record);
			}
		}
		return rsBookSet;
	}

	@Override
	public List<Book> searchBookByAuthor(String bookAuthor) {
		List<Book> books = bookDao.searchBookByName(bookAuthor);

		List<Book> rsBookSet = new ArrayList<>();
		for (Book record : books) {
			if (record.getAuthor().toLowerCase().contains(bookAuthor.toLowerCase())) {
				rsBookSet.add(record);
			}
		}
		return rsBookSet;
	}

	@Override
	public List<Book> showAllBooks() {
		List<Book> books = bookDao.showAllBooks();
		return books;
	}

}
