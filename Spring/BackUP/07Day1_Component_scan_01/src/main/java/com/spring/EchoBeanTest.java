package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class EchoBeanTest {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");
		
		DeptService service = ctx.getBean("deptService", DeptService.class);
		//bean의 id는 첫 글자가 소문자인 클래스명
		String str = service.getService();
		System.out.println(str);
	}
}
