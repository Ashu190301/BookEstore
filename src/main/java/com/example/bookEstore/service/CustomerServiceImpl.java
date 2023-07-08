package com.example.bookEstore.service;

import com.example.bookEstore.dao.CustomerDao;
import com.example.bookEstore.model.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	@Autowired
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public int addCustomer(Customer customer) {
		
		

		int noOfRow = customerDao.addCustomer(customer);
		

		return noOfRow;
	}

	@Override
	public Boolean loginCustomer(String email, String pass) {
		
		List<Customer> customers = customerDao.loginCustomer(email, pass);
		
		for (Customer record : customers) {
	         if(  record.getEmail().equals(email) && record.getPassword().equals(pass) ) {
	        	 System.out.println(record.getEmail());
	        	 System.out.println(record.getPassword());
	        	 return true;
	        	 }
	        	 
	     } 
		
		return false;
	}

}
