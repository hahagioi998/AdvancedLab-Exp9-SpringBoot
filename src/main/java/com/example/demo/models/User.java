package com.example.demo.models;

public class User {
	
	private String name;
	private String userName;
	private String email;
	
	public User() {
		super();
		
	}

	public User(String name, String userName, String email) {
		super();
		this.name = name;
		this.userName = userName;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Users [name=" + name + ", userName=" + userName + ", email=" + email + "]";
	}
	
	
}
