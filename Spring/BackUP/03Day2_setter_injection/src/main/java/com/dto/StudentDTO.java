package com.dto;

// 빈(Bean)
public class StudentDTO {
	
	//property
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", age=" + age + "]";
	}
	
	
	

	
}
