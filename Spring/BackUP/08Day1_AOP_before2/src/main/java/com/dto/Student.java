package com.dto;

import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	public String sayEcho() { //핵심 로직
		return "sayEcho()";
	}
	public String callEcho() { //핵심 로직
		return "callEcho()";
	}
	public String callTest() { //핵심 로직
		return "callTest()";
	}
}
