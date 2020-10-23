package com.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private String name; 
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("기본생성자 호출");
	}
	
	@PostConstruct
	public void xxx() {
		System.out.println("초기화 메서드");
	}
	
	@PreDestroy
	public void yyy() {
		System.out.println("자원 반납 메서드");
	}
	
	
}
