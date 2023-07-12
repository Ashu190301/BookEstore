package com.example.bookEstore.service;

import java.sql.Date;
import java.util.List;

import com.example.bookEstore.model.Order;

public interface OrderService {
	int placeOrder(String email);
	List<Order> viewOrder(String email);
	int cancelItem(String email,Date orderDate,String orderTime,String barcode);
}
