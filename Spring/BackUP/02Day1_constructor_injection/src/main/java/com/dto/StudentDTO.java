package com.dto;

public class StudentDTO {
	private String name;
	public StudentDTO() { System.out.println("Student 기본생성자 호출");} //*사용자가 생성자 작성 시 기본 생성자가 사라짐 
	public StudentDTO(String name) { //생성자 작성
		// TODO Auto-generated constructor stub
		System.out.println("인자있는 생성자");
		this.name = name;
	}
	
	public String getInfo() {
		return this.name;
	}
}
