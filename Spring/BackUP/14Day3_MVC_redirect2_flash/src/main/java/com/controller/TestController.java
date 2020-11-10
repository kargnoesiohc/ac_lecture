package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {

	@RequestMapping("/main")
	public String main() {
		System.out.println("main() 호출");
		return "main";
	}
	

	
	
//	@RequestMapping("/redirect")
//	//redirect 전용 object, 사용법은 model과 동일.  redirect시 query-string을 이용하여 다음 페이지로 파라미터 전달
//	//flash scope지원
// 	public String redirect(RedirectAttributes m) { 
//		System.out.println("redirect() 흐출");
//		//redirect가 완료 될 때까지만 저장되는 스프링이 만든 scope, 1회성 세션 같은 느낌
//		m.addFlashAttribute("userid", "홍길동"); 
//		//매핑 값이 /main인 곳으로 감 -> /main에서 main.jsp로 또 가기때문에 출력 안됨
//		//즉, requset.getParameter(); 와 같음
//		return "redirect:main"; 
//	}
}

