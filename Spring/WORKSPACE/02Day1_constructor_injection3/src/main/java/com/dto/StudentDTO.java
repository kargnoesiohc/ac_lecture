package com.dto;

public class StudentDTO {
	private String name;
	private int age;
	private CatDTO cat; //has a 표현
  	
	public StudentDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("기본 생성자 호출");
	} //기본 생성자
	

	public StudentDTO(String name, int age, CatDTO cat) {
		super();
		this.name = name;
		this.age = age;
		this.cat = cat;
	}


	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}

	
}
