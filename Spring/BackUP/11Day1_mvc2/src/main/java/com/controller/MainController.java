package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/xxx")
	public String xxx() {
		System.out.println("xxx() 실행");
		return "test";
	}
	
	@RequestMapping("/yyy")
	public String yyy() {
		System.out.println("yyy() 실행");
		return "test";
	}
}
