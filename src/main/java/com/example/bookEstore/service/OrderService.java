package com.example.bookEstore.service;

import java.util.List;

import com.example.bookEstore.model.Order;

public interface OrderService {
	int placeOrder(String email);
	List<Order> viewOrder(String email);
}
