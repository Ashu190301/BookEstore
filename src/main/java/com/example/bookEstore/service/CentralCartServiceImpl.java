package com.example.bookEstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookEstore.dao.CentralCartDao;
import com.example.bookEstore.model.Book;

@Service
public class CentralCartServiceImpl implements CentralCartService {
	
	private CentralCartDao cartDao;
	
	
	@Autowired
	public void setCartDao(CentralCartDao cartDao) {
		this.cartDao = cartDao;
	}



	@Override
	public int addToCart(String email, String barcode, int quantity) {
		if(cartDao.findQuantity(barcode)>=quantity) {
			return cartDao.addToCart(email, barcode, quantity);
		}
		return 0;
	}



	@Override
	public int findQuantity(String barcode) {
		
		return cartDao.findQuantity(barcode);
	}



	@Override
	public List<Book> showCart(String email) {
		return cartDao.showCart(email);
	}



	@Override
	public int deleteFromCart(String email, String barcode) {
		
		return cartDao.deleteFromCart(email, barcode);
	}



	@Override
	public int deleteAllFromCart(String email) {
		
		return cartDao.deleteAllFromCart(email);
	}



	@Override
	public double totalCartValue(String email) {
		return cartDao.totalCartValue(email);
	}

}
