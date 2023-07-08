package com.example.bookEstore.controller;

import com.example.bookEstore.model.Customer;
import com.example.bookEstore.service.CustomerService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationController.class);
	
	@Autowired
	private CustomerService custService;
	

	@RequestMapping("/login")
	public String login() {
		LOGGER.info("Sucessfully retuned loginpage");
		return "loginpage";
	}

	@RequestMapping(path="/registrationhandler" , method=RequestMethod.POST)
	public String registration(
			@RequestParam("firstName") String fName, 
			@RequestParam("lastName") String lname,
			@RequestParam("addrs") String addrs, 
			@RequestParam("email") String email, 
			@RequestParam("pass") String pass) {

		Customer cust = new Customer(fName, lname, addrs, email, pass);
		custService.addCustomer(cust);

		return "redgsuccess";

	}
	@RequestMapping(path="/loginhandler", method=RequestMethod.POST)
	public  String login(
			@RequestParam("email") String email,
			@RequestParam("pass") String pass 
			) {
		LOGGER.info("loginhandler Running successfully");
		Boolean rs = custService.loginCustomer(email, pass);
		if(rs) {
			return "redirect:home";
		}
		return "loginfail";
	}
	@RequestMapping("/registration")
	public String redg() {
		LOGGER.info("Sucessfully retuned registrationpage");
		return "registrationpage";
	}

	

}
