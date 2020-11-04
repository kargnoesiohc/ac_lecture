package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
	}
	
	@RequestMapping("/login")
	public ModelAndView loginDTO(LoginDTO dto) { //파싱 데이터로 로그인 객체 생성
		System.out.println("loginDTO -> "+dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("loginDTO",dto);
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping("/login2")
	public String loginxxx(@ModelAttribute("xxx") LoginDTO dto) { //ModelAttribute에 'xxx'라는 키로 넣음
		return "login2";
	}
	
}
