package com.dto;

// 빈(Bean)
public class StudentDTO {
	
	//property
	private String name;
	private String age;
	

	public void setAge(String age) {
		this.age = age;
	}

	public void setName(String name) {
		System.out.println("setter 호출");
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", age=" + age + "]";
	}

	
}
