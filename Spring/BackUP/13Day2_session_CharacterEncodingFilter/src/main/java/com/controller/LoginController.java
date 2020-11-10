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
public class LoginController {
	@RequestMapping("/login")
	public String loginGet() {
		System.out.println("loginGet() 호출");
		return "loginForm";
	}
	
//	@RequestMapping(value="/login", method = RequestMethod.POST)
//	public String loginPost(@ModelAttribute("xxx") LoginDTO dto) {
//		System.out.println("loginPost() 호출");
//		return "login";
//	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) {
		System.out.println("login() 호출");
		session.setAttribute("login", dto);
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("login");
		System.out.println("login 세션 삭제");
		return "redirect:login"; //response.sendRedirect와 동일. 단, 매핑된 주소로 찾아감, 따라서 loginForm.jsp로 이동(get방식 이기 때문)
	}
	
}
