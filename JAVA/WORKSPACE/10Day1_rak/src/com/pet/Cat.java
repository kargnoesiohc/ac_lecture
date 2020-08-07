package com.pet;
public class Cat extends Pet implements Movement{

	private String gender;
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Cat [gender=" + gender + ", getName()=" + getName() + ", getAge()=" + getAge()+"]";
	}
	@Override
	public void cry() {
		System.out.println("cat cry()");		
	}
	@Override
	public void eat() {
		System.out.println("cat eat()");	
		
	}
	@Override
	public void sleep() {
		System.out.println("cat sleep()");			
	}

	
	
}
