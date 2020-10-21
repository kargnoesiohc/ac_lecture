package com.dto;

// 빈(Bean)
public class StudentDTO {
	
	//property
	private String name;
	private String age;
	private CatDTO cat;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setCat(CatDTO cat) { //cat 주입 setXXX 함수
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}
	
	
	
	


	
}
