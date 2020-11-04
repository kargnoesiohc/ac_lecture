package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
public class TestController {
	
	@RequestMapping("/main")
	public String main() {
		System.out.println("main() 호출");
		return "main";
	}
	
	@RequestMapping("/loginForm") //default: GET
	public String loginForm() {
		System.out.println("loginForm() 호출");
		return "loginForm";
	}
	
	
	@RequestMapping("/main2")
	public ModelAndView mav() {
		
		ModelAndView mav = new ModelAndView(); //데이터 key:value 저장, view페이지 정보 저장
		mav.addObject("username", "홍길동"); // == request.setAttribute();와 동일
		mav.addObject("age", 20);
		mav.setViewName("main2"); // view페이지 지정, RequestDispatcher와 동일
		return mav; // ModelAndView객체를  리턴, view페이지 리턴 X 
	}
	
	//다른 예제 
	//login3를 ModelAndView 사용하기 - 11Day2_MVC_parameter
		@RequestMapping("/loginMav")
		public ModelAndView loginMav(@RequestParam Map<String, String> map) { //map으로도 받는게 가능
			ModelAndView mav = new ModelAndView();
			mav.addAllObjects(map);
			mav.setViewName("login");
			return mav;                        
		}
	

	
}
