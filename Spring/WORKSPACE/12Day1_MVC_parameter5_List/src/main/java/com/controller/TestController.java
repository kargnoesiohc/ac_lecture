package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping("/main1")
	public ModelAndView list1(ArrayList<String> list) { //자동으로 ArrayList를 생성
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list); //'list'키에 list 저장
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/main2")
	//'xxx'키로 ModelAttribute에 list저장, jsp파일에서 xxx로 list출력
	public String list2(@ModelAttribute("xxx") ArrayList<String> list) { 
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return "main2";
	}
	
	@RequestMapping("/main3")
	public String list3(ArrayList<String> list) { //${stringList} 키 값이 된다(아마도 컬렉션 객체만 가능). (String타입의 List, 맨 앞글자는 소문자) 
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return "main3";
	}
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
	}
	
	@RequestMapping("/login") 
	public String loginList(LoginDTO dto, String userid, String passwd) { //키 값은 맨 앞글자가 소문자인 클래스 명 
		dto.setUserid(userid);
		dto.setPasswd(userid);
		return "login";
	}
}
