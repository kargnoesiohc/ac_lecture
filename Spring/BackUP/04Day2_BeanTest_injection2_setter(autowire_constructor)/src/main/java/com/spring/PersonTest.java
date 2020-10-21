package com.spring;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("echo1.xml","echo2.xml");
		
		Person person = ctx.getBean("onePerson", Person.class);
		System.out.println(person);
		
	}

}

