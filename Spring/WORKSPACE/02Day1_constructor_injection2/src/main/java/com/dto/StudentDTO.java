package com.dto;

public class StudentDTO {
	private String name;
	private int age;
	
	public StudentDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("기본 생성자 호출");
	} //기본 생성자
	
	public StudentDTO(String name) {
		super();
		this.name = name;
		System.out.println("name만 있는 생성자 호출");
	}

	public StudentDTO(int age) {
		super();
		this.age = age;
		System.out.println("age만 있는 생성자 호출");
	}

	public StudentDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("name, age가 있는 생성자 호출");
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
