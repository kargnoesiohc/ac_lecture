package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/main")
	public String main() {
		System.out.println("main() 호출");
		return "main";
	}
	
	@RequestMapping("/kkk")
	public String kkk() {
		System.out.println("kkk() 호출");
		return "kkk";
	}
}
