package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping("/main")
	public String main() {
		System.out.println("main() 호출");
		return "main";
	}
	
	@RequestMapping("/memberForm")
	public String memberForm() {
		System.out.println("memberForm() 호출");
		return "memberForm";
	}
	
	@RequestMapping("/member")
	public String member() {
		System.out.println("member() 호출");
		return "member";
	}
	
	
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		System.out.println("loginForm() 호출");
		return "loginForm";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login() {
		System.out.println("login() 호출");
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		System.out.println("logout() 호출");
		return "logout";
	}
	
}
