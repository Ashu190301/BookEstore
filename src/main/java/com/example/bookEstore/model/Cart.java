package com.example.bookEstore.model;

public class Cart {
	private String bookname;
	private String author;
	private double price;
	private int quantity;
	private String email;
	
	public Cart() {
		
	}

	public Cart(String bookname, String author, double price, int quantity, String email) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		this.email = email;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cart [bookname=" + bookname + ", author=" + author + ", price=" + price + ", quantity=" + quantity
				+ ", email=" + email + "]";
	}
	
}
