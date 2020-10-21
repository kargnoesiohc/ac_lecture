package com.dto;

public class PersonDTO {
	private String name;
	private int age;
	private String gender;
	private CatDTO cat;
	
	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonDTO(String name, int age, String gender, CatDTO cat) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.cat = cat;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CatDTO getCat() {
		return cat;
	}

	public void setCat(CatDTO cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + ", gender=" + gender + ", cat=" + cat + "]";
	}
	
	
	
	
}
