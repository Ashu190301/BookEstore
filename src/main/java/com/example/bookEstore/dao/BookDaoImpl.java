package com.example.bookEstore.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bookEstore.model.Book;
import com.example.bookEstore.dao.BookMapper;

@Repository
public class BookDaoImpl implements BookDao {
	private final static String SQL_SRCH_BOOK = "select * from book";

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Override
	public List<Book> searchBookByName(String bookName) {
		List <Book> books = jdbcTemplate.query(SQL_SRCH_BOOK, new BookMapper());
	      return books;
	}
	@Override
	public List<Book> searchBookByAuthor(String bookAuthor) {
		List <Book> books = jdbcTemplate.query(SQL_SRCH_BOOK, new BookMapper());
	      return books;
	}
	@Override
	public List<Book> showAllBooks() {
		List <Book> books = jdbcTemplate.query(SQL_SRCH_BOOK, new BookMapper());
	      return books;
	}

}
