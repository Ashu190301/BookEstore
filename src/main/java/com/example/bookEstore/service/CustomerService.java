package com.example.bookEstore.service;


import com.example.bookEstore.model.Customer;

public interface CustomerService {
	int addCustomer(Customer customer);
	Boolean loginCustomer(String email, String pass);
}
