package com.example.bookEstore.model;

public class CentralCart {
	private int serialNo;
	private String email;
	private String barcode;
	private int quantity;
	
	public CentralCart() {
		
	}

	public CentralCart(int serialNo, String email, String barcode, int quantity) {
		super();
		this.serialNo = serialNo;
		this.email = email;
		this.barcode = barcode;
		this.quantity = quantity;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [serialNo=" + serialNo + ", email=" + email + ", barcode=" + barcode + ", quantity=" + quantity
				+ "]";
	}
	
}
