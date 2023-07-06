package com.example.bookEstore.dao;

import java.util.List;

import com.example.bookEstore.model.Customer;

public interface CustomerDao {
	int addCustomer(Customer customer);
	List<Customer> loginCustomer(String email, String pass);
}
