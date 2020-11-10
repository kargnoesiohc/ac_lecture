package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	//http://localhost:8080/app/main
	@RequestMapping("/main")
	public String xxx() {
		System.out.println("main 요청");
		return "main";
	}
	
}
