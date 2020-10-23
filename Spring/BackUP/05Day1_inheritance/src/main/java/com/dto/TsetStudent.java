package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TsetStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		
		Man man = ctx.getBean("man",Man.class);
		Woman woman = ctx.getBean("woman",Woman.class);
		
		System.out.println(man);
		System.out.println(woman);
	}

}
