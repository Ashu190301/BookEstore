package com.example.bookEstore.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bookEstore.model.Book;
import com.example.bookEstore.service.CentralCartService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CartController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	private CentralCartService cartService;
	
	@RequestMapping("/cart/{barcode}")
	public String addToCart(@PathVariable("barcode") String barcode,HttpServletRequest request) {
		HttpSession session= request.getSession();
		String email=(String)session.getAttribute("email");
		if(email==null) {
			return "redirect:/login";
		}
		int noOfRow = cartService.addToCart(email, barcode, 1);
		
		return "redirect:/home";
	}
	
	@RequestMapping("/cart")
	public String cart(Model model,HttpServletRequest request) {
		
		LOGGER.info("Sucessfully retuned cartpage");
		HttpSession session= request.getSession();
		String email=(String)session.getAttribute("email");
		if(email==null) {
			return "redirect:/login";
		}
		
		List<Book> bookList = cartService.showCart(email);
		double totalCartPrice=cartService.totalCartValue(email);
		model.addAttribute("booklist",bookList);
		model.addAttribute("totalCartPrice",totalCartPrice);
		return "cartpage";
	}
	
	@RequestMapping("/remove/{barcode}")
	public String removeFromCart(@PathVariable("barcode") String barcode,HttpServletRequest request) {
		HttpSession session= request.getSession();
		String email=(String)session.getAttribute("email");
		if(email==null) {
			return "redirect:/login";
		}
		int noOfRow = cartService.deleteFromCart(email, barcode);
		
		return "redirect:/cart";
	}
}
