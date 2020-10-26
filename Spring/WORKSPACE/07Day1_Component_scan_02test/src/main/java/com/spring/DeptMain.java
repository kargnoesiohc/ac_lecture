package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");
		
		DeptService service = ctx.getBean("service",DeptService.class);
		System.out.println(service.getDeptDTO());
	}

}
