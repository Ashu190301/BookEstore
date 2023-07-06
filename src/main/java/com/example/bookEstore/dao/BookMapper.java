package com.example.bookEstore.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.bookEstore.model.Book;


public class BookMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		
		book.setName(rs.getString("bookname"));
		book.setBarcode(rs.getString("barcode"));
		book.setAuthor(rs.getString("author"));
		book.setPrice(rs.getDouble("price"));
		book.setQuantity(rs.getInt("quantity"));
		
		return book;
	}

}
