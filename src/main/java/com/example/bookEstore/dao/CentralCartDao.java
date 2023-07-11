package com.example.bookEstore.dao;

import java.util.List;

import com.example.bookEstore.model.Book;

public interface CentralCartDao {
	int addToCart(String email, String barcode, int quantity);
	int findQuantity(String barcode);
	List<Book> showCart(String email);
	int deleteFromCart(String email,String barcode);
	int deleteAllFromCart(String email);
	double totalCartValue(String email);

}
