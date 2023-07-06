package com.example.bookEstore.service;

import java.util.ArrayList;
import java.util.List;

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
		
		String lowerCaseBook = bookName.toLowerCase();
		
		List<Book> books=bookDao.searchBookByName(bookName);
		List<Book> rs = new ArrayList<>();
		for (Book rec : books) {
			if((rec.getName().toLowerCase()).contains(lowerCaseBook)) {
				rs.add(rec);
			}
		}
		
		return rs;
		
	}

}
