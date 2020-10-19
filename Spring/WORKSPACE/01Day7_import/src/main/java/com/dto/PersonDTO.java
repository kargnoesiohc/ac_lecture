package com.dto;

public class PersonDTO {
	
	private String name; 
	private int age;
	
	public PersonDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("PersonDTO 기본 생성자 호출");
	}

	public PersonDTO(String name, int age) {
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
		return "PersonDTO [name=" + name + ", age=" + age + "]";
	}
	
	
}
