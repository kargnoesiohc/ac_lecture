package com.dto;

// 빈(Bean)
public class StudentDTO {
	
	//property
	private String name;

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter 호출");
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + "]";
	}
	
}
