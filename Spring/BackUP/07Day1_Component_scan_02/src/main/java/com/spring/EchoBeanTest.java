package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.entity.DeptDTO;
import com.service.DeptService;

public class EchoBeanTest {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");
		
		DeptService service = ctx.getBean("service", DeptService.class);
		DeptService service2 = ctx.getBean("service", DeptService.class);
		System.out.println(service == service2);
		//bean의 id는 첫 글자가 소문자인 클래스명
		DeptDTO dto = service.getInfo();
		System.out.println(dto);
		
//		DeptDAO xxx = ctx.getBean("deptDAO", DeptDAO.class);//@Repository
		DeptDAO xxx = ctx.getBean("dao", DeptDAO.class); //@Repository("dao")
		System.out.println(xxx.getInfo());
	}
}
