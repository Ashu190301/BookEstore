package com.example.bookEstore.dao;

import java.util.List;

import com.example.bookEstore.model.Order;

public interface OrderDao {
	int placeOrder(String email);
	List<Order> viewOrder(String email);
}
