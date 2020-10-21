package com.spring;

public class Person {
	public Person(String x) {
		// TODO Auto-generated constructor stub
		System.out.println("Person 생성자 : "+ x);
	}
	public Person(String x, String y) {
		// TODO Auto-generated constructor stub
		System.out.println("Person 생성자 : "+ x+"\t"+y );
	}
	public Person(String xx, int yy) {
		// TODO Auto-generated constructor stub
		System.out.println("Person 생성자 : "+ xx+"\t"+yy);
	}
	
	public String getInfo() {
		return "홍길동";
	}
	
}