package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class LoginController {
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
	
	@RequestMapping(value="/loginForm", method = RequestMethod.POST)
	public String loginForm2(LoginDTO dto) {  //LoginDTO로 자동 생성 저장됨 (데이터 파싱, set)
		System.out.println("/login post data dto " + dto);
		return "loginForm";
	}
	
	@RequestMapping("/login2") 
	public String login2(HttpServletRequest request) {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println(userid+"/"+passwd);
		return "loginForm";
	}
	
	
	@RequestMapping("/login3")
	public String login3(@RequestParam("userid") String id, @RequestParam("passwd") String pw) { //데이터를 따로 따로 파싱
		System.out.println("@RequestParam parsing "+ id+"/"+pw);
		return "loginForm";
	}
	
	//login3를 ModelAndView 사용하기
	@RequestMapping("/loginMav")
	public ModelAndView loginMav(@RequestParam Map<String, String> map) {
		ModelAndView mav = new ModelAndView();
		mav.addAllObjects(map);
		mav.setViewName("login");
		return mav;                        
	}
	
	
	@RequestMapping(value="/login4", method = RequestMethod.POST)
	public String login4(String userid, String passwd) { //form과 일치하면 자동 파싱
		System.out.println(userid+"/"+passwd);
		return "loginForm";
	}
	
	@RequestMapping("/login5") //왜 안되는지 모르겠으나 defaultValue가 안들어감
	public String login5(@RequestParam(required = false, defaultValue = "홍길동") String userid, String passwd) {
		System.out.println(userid+"/"+passwd);
		return "loginForm";
	}
	
	@RequestMapping(value = "/login6", method = RequestMethod.POST)
	public String login6(@RequestParam Map<String, String> map) {
		System.out.println(map);
		return "loginForm";
	}
	
}
