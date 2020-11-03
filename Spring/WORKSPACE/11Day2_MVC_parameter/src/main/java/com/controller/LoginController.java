package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class LoginController {
	@RequestMapping("/loginForm") //default: GET
	public String loginForm() {
		System.out.println("loginForm() 호출");
		return "loginForm";
	}
	
	@RequestMapping(value="/loginForm", method = RequestMethod.POST) //default: get
	public String loginForm2(LoginDTO dto) {  //LoginDTO로 자동 생성 저장됨 (데이터 파싱, set)
		System.out.println("/login post data dto " + dto);
		return "loginForm";
	}
	
	@RequestMapping("/login2") //default: GET
	public String login2(@RequestParam("userid") String id, @RequestParam("passwd") String pw) { //데이터를 따로 따로 파싱
		System.out.println("@RequestParam parsing "+ id+"/"+pw);
		return "loginForm";
	}
	
	@RequestMapping("/login3") 
	public String login3(HttpServletRequest request) {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println(userid+"/"+passwd);
		return "loginForm";
	}
	
	
	
}
