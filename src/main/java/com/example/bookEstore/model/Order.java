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
	private String orderTime;
	private Date deliveryDate;
	private boolean isDelivered;
	
	public Order() {
		
	}

	public Order(String email, String barcode, String bookName, String author, int quantity, double orderValue,
			Date orderDate, String orderTime, Date deliveryDate, boolean isDelivered) {
		super();
		this.email = email;
		this.barcode = barcode;
		this.bookName = bookName;
		this.author = author;
		this.quantity = quantity;
		this.orderValue = orderValue;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.deliveryDate = deliveryDate;
		this.isDelivered = isDelivered;
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

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public boolean getIsDelivered() {
		return isDelivered;
	}

	public void setIsDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

	@Override
	public String toString() {
		return "Order [email=" + email + ", barcode=" + barcode + ", bookName=" + bookName + ", author=" + author
				+ ", quantity=" + quantity + ", orderValue=" + orderValue + ", orderDate=" + orderDate + ", orderTime="
				+ orderTime + ", deliveryDate=" + deliveryDate + ", isDelivered=" + isDelivered + "]";
	}


	

}
