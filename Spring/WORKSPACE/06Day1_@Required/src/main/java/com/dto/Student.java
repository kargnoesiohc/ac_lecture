package com.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private int age;
	
	private Cat cat; 
	

	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	@Required //필수
	@Qualifier("pet02")
	public void setCat(Cat cat) {
		this.cat = cat;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}
	
	
	
	
	
	
}
