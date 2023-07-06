package com.example.bookEstore.model;

public class Customer {
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String pass;

	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName, String address, String email, String pass) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.pass = pass;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return pass;
	}

	public void setPassword(String pass) {
		this.pass = pass;
	}



	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", email=" + email
				+ ", password=" + pass + "]";
	}
}
