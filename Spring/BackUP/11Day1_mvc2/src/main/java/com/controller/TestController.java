package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	public String Test() {
		System.out.println("test() 실행");
		return "test";
	}
	
	@RequestMapping("/test1")
	public String Test1() {
		System.out.println("test2() 실행");
		return "test";
	}
}
