package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/main")
	public String main() {
		System.out.println("main() 호출");
		return "main";
	}
	
	
	@RequestMapping("/redirect")
	public String redirect(Model m) {
		System.out.println("redirect() 흐출");
		m.addAttribute("userid", "홍길동"); 
		//매핑 값이 /main인 곳으로 감 -> /main에서 main.jsp로 또 가기때문에 출력 안됨
		//즉, requset.getParameter(); 와 같음
		return "redirect:main"; 
	}
}

