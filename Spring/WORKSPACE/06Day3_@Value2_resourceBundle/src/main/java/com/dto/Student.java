package com.dto;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${stu.name}") //다른 객체에 있는 값을 가져와서 설정 가능
	private String name;
	@Value("${stu.age}")
	private int age;
	
	
	//setter injection
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
}
