package com.example.bookEstore.service;

import java.util.List;

import com.example.bookEstore.model.Customer;

public interface CustomerService {
	int addCustomer(Customer customer);
	Boolean loginCustomer(String email, String pass);
}
