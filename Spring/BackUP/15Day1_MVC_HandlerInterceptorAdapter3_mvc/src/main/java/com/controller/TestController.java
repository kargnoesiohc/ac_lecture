package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/main")
	public String main() {
		System.out.println("TestController.main() 호출");
		return "main";
	}
	
	@RequestMapping("/login")
	public String loginForm() {
		System.out.println("TestController.loginForm() 호출");
		return "loginForm";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam Map<String,String> map) {
		System.out.println("TestController.login() 호출");
		ModelAndView mav = new ModelAndView();
		mav.addAllObjects(map);
		mav.setViewName("login");
		return mav;
	}

}
