package com.example.bookEstore.model;

import java.sql.Date;

public class Order {
	
	private String email;
	private String barcode;
	private String bookName;
	private String author;
	private int quantity;
	private double orderValue;
	private Date orderDate;
	private Date deliveryDate;
	
	public Order() {
		
	}

	public Order(String email, String barcode, String bookName, String author, int quantity, double orderValue,
			Date orderDate, Date deliveryDate) {
		super();
		this.email = email;
		this.barcode = barcode;
		this.bookName = bookName;
		this.author = author;
		this.quantity = quantity;
		this.orderValue = orderValue;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Override
	public String toString() {
		return "Order [email=" + email + ", barcode=" + barcode + ", bookName=" + bookName + ", author=" + author
				+ ", quantity=" + quantity + ", orderValue=" + orderValue + ", orderDate=" + orderDate
				+ ", deliveryDate=" + deliveryDate + "]";
	}
	
	
	

}
