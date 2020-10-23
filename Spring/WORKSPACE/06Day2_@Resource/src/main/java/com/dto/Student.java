package com.dto;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private int age;
	
	@Resource(name="pet01")  //autowired와 quailfier를  한번에 
	private Cat cat; //CoC변수와 같은 객체의 주입
	

	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}
	
	
	
	
	
	
}
