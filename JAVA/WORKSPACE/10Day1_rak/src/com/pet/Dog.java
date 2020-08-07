package com.pet;

public class Dog extends Pet implements Movement{

	private String color;

	//기능==> 이전에 오버라이딩
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
public String toString() {
		return "Dog [color=" + color + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
}

@Override
	public void cry() {
		System.out.println("dog cry()");		
	}
	@Override
	public void eat() {
		System.out.println("dog eat()");	
		
	}
	@Override
	public void sleep() {
		System.out.println("dog sleep()");			
	}
	
	
	
}
