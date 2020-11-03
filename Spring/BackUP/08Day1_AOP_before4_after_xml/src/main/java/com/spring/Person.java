package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Person {
	public void getInfo() {
		System.out.println("getInfo()");
	}

	public void mesg() {
		System.out.println("mesg()");
	}
}
