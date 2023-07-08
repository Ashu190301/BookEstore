package com.example.bookEstore.dao;

import com.example.bookEstore.model.Customer;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	private final static String SQL_ADD_CUST = "insert into customer (fname,lname,addrs,email,pass)  values(?,?,?,?,?)";
	private final static String SQL_SRCH_CUST = "select * from customer";

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int addCustomer(Customer customer) {
		int noOfRow = jdbcTemplate.update(SQL_ADD_CUST, customer.getFirstName(), customer.getLastName(),
				customer.getAddress(), customer.getEmail(), customer.getPassword());

		return noOfRow;
	}

	@Override
	public List<Customer> loginCustomer(String email, String pass) {
		
		List <Customer> customers = jdbcTemplate.query(SQL_SRCH_CUST, new CustomerMapper());
	      return customers;
	}

}
