package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	
	@RequestMapping("/aaa")
	public String aaa() {
		if(true) throw new ArithmeticException("error 발생 1"); //main으로  ArithmeticException을 throw -> Exception 발생
		return "main";
	}
	
	@RequestMapping("/bbb")
	public String bbb() {
		if(true) throw new NullPointerException("error 발생 2");
		return "main";
	}
	
	
	//Exception 발생 시, 등록 페이지(error.jsp)로 이동
	@ExceptionHandler(Exception.class)
	public String errorPage() {
		return "error";
	}
	
	
}
