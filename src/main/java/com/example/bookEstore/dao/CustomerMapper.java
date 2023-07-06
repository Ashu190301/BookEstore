package com.example.bookEstore.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.bookEstore.model.Customer;


public class CustomerMapper  implements RowMapper<Customer> {
	
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		com.example.bookEstore.model.Customer customer = new Customer();
		
		customer.setFirstName(rs.getString("fname"));
		customer.setLastName(rs.getString("lname"));
		customer.setAddress(rs.getString("addrs"));
		customer.setEmail(rs.getString("email"));
		customer.setPassword(rs.getString("pass"));
		
		return customer;
	}

}
