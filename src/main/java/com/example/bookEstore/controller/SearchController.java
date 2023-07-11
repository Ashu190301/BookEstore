package com.example.bookEstore.controller;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.example.bookEstore.model.Book;
import com.example.bookEstore.service.BookService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class SearchController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SearchController.class);
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/search")
	public String search(HttpServletRequest request) {
		HttpSession session= request.getSession();
		String email=(String)session.getAttribute("email");
		if(email==null) {
			return "redirect:/login";
		}
		LOGGER.info("Sucessfully retuned searchpage");
		return "searchpage";
	}
	
	@RequestMapping("/searchhandler")
	
	public String searchhandler(
			Model model,
			@RequestParam("filter") String filter, 
			@RequestParam("query") String query,
			HttpServletRequest request
			) {
		HttpSession session= request.getSession();
		String email=(String)session.getAttribute("email");
		if(email==null) {
			return "redirect:/login";
		}
		List<Book> bookList= new ArrayList<>();
		
		if(query.length()>0) {
			if(filter.equals("title")) {
				bookList = bookService.searchBookByName(query);
				
			}
			else {
				bookList = bookService.searchBookByAuthor(query);
			}
		}
		
		
		
		model.addAttribute("booklist",bookList);
		return "searchpage";
	}
}
