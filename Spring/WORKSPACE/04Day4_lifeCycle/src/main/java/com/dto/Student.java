package com.dto;

public class Student {
	private String name; 
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("기본생성자 호출");
	}
	
	//init-method: 초기화 작업
	public void aaa() {
		System.out.println("init-method.aaa");
		this.name = "홍길동";
	}

	public String getName() {
		return name;
	}
	
	//destory-method: 자원 반납
	public void bbb() {
		System.out.println("destory-method.bbb");
	}

	
	
}
