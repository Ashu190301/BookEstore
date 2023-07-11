package com.example.bookEstore.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bookEstore.model.Order;
import com.example.bookEstore.service.OrderService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class OrderController {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/placeorder")
	public String placeOrder(HttpServletRequest request) {
		
		LOGGER.info("Sucessfully placed order");
		HttpSession session= request.getSession();
		String email=(String)session.getAttribute("email");
		if(email==null) {
			return "redirect:/login";
		}
		orderService.placeOrder(email);
		return "redirect:/cart";
		
	}
	@RequestMapping("/vieworder")
	public String viewOrder(Model model,HttpServletRequest request) {
		
		LOGGER.info("Sucessfully viewed order");
		HttpSession session= request.getSession();
		String email=(String)session.getAttribute("email");
		if(email==null) {
			return "redirect:/login";
		}
		List<Order> orders=orderService.viewOrder(email);
		model.addAttribute("orderlist",orders);
		return "myorder";
		
	}
}
