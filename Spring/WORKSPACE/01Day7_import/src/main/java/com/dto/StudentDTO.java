package com.dto;

public class StudentDTO {
	private String name;
	private int age; 
	public StudentDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("Student 기본생성자 호출");
	}
	public StudentDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
