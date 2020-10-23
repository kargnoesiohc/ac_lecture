package com.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
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

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean.afterPropertiesSet");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	
}
