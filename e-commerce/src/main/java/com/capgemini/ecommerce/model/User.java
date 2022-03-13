package com.capgemini.ecommerce.model;

public class User {
	private String userName;
	private String email;
	private String password;
	private String address;
	private int phone;
	
	public User() {
	}

	public User(String userName, String email, String password, String address, int phone) {
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", password=" + password + ", address=" + address
				+ ", phone=" + phone + "]";
	}
	
	
	
}
