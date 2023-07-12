package com.example.bookEstore.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bookEstore.model.Book;
import com.example.bookEstore.dao.BookMapper;


@Repository
public class CentralCartDaoImpl implements CentralCartDao {
	private final static String SQL_ADD_TO_CART = "insert into central_cart (email,barcode,quantity) values (?,?,?)";
	private final static String SQL_FIND_QUANTITY = "select * from book where barcode = ? ";
	private final static String SQL_SHOW_CART = "select b.barcode,b.bookname, b.author, b.price, count(c.quantity)as quantity,email from book b inner join central_cart c on c.barcode=b.barcode group by b.barcode, b.bookname, b.author, b.price,email having c.email=?";
	private final static String SQL_DELETE_FROM_CART = "delete from central_cart where barcode = ? and email=? ";
	private final static String SQL_DELETE_ALL_FROM_CART = "delete from central_cart where email=? ";
	private final static String SQL_TOTAL_CART_VALUE = "select sum(total_price) as cart_value from (select count(c.quantity)*b.price as total_price,email from book b inner join central_cart c on c.barcode=b.barcode group by b.price,email having c.email=?) as cart";
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Override
	public int addToCart(String email, String barcode, int quantity) {
		int noOfRow = jdbcTemplate.update(SQL_ADD_TO_CART, email,barcode,quantity);
		return noOfRow;
	}
	@Override
	public int findQuantity(String barcode) {
		Book book = jdbcTemplate.queryForObject(SQL_FIND_QUANTITY,new BookMapper(),barcode);
		return book.getQuantity();
	}
	@Override
	public List<Book> showCart(String email) {
		List<Book> books = jdbcTemplate.query(SQL_SHOW_CART,new BookMapper(),email);
		return books;
	}
	@Override
	public int deleteFromCart(String email, String barcode) {
		int noOfRow = jdbcTemplate.update(SQL_DELETE_FROM_CART,barcode,email);
		return noOfRow;
	}
	@Override
	public int deleteAllFromCart(String email) {
		int noOfRow = jdbcTemplate.update(SQL_DELETE_ALL_FROM_CART,email);
		return noOfRow;
	}
	@Override
	public double totalCartValue(String email) {
		double totalCartPrice=jdbcTemplate.queryForObject(SQL_TOTAL_CART_VALUE,(rs,rowNum)->{ return rs.getDouble("cart_value");},email);
		return totalCartPrice;
	}

}
