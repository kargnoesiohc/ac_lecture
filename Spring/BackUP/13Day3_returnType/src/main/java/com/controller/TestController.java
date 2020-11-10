package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	//1. 리턴타입 String => view만 알려줌
	@RequestMapping("/xxx1")
	public String xxx1() {
		return "main";
	}
	
	@RequestMapping("/xxx2")
	public ModelAndView xxx2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "홍길동");
		mav.setViewName("main2");
		return mav;
	}
	
	//3. 리턴타입 dto => 모델만 알려주고 view는 유추 (main3.jsp), 권장 X
	@RequestMapping("/main3")
	public LoginDTO xxx3() {
		LoginDTO dto = new LoginDTO();
		dto.setUserid("aaa");
		dto.setPasswd("1234");
		return dto; //맨 앞글자 소문자 클래스명이 키 값
	}
	
	//3-2 위에꺼에서 객체의 키 값만 지정, 권장 X
	@RequestMapping("/main4")
	@ModelAttribute("xxx")//전달 객체의 key를 xxx로 저장
	public LoginDTO xxx4() {
		LoginDTO dto = new LoginDTO();
		dto.setUserid("bbbb");
		dto.setPasswd("2222");
		return dto; //맨 앞글자 소문자 클래스명이 키 값
	}
	
	
}
