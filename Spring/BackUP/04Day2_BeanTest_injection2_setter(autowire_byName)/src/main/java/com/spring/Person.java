package com.spring;

public class Person {
	private String username;
	private Cat cat;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Cat getCat() {
		return cat;
	}


	public void setCat(Cat cat) {
		this.cat = cat;
	}


	@Override
	public String toString() {
		return "Person [username=" + username + ", cat=" + cat + "]";
	}




	
	
	
}