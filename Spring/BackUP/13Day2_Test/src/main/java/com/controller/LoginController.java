package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class LoginController {

	@RequestMapping("/main")
	public String main() {
		System.out.println("main() 호출");
		return "main";
	}

	@RequestMapping("/member")
	public String memberForm() {
		System.out.println("memberForm() 호출");
		return "member/member";
	}

	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String member(LoginDTO dto, HttpSession session) {
		System.out.println("member() 호출");
		session.setAttribute("memberDTO", dto);
		System.out.println("세션에 가입 정보 저장 성공");
		return "main";
	}

	@RequestMapping("/login")
	public String loginForm() {
		System.out.println("loginForm() 호출");
		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) {
		LoginDTO memberDTO = (LoginDTO) session.getAttribute("memberDTO");

		String nextPage = null;
		if (memberDTO != null) {
			if (dto.getUserid().equals(memberDTO.getUserid()) && dto.getPasswd().equals(memberDTO.getPasswd())) {
				session.removeAttribute("memberDTO");
				System.out.println("가입 정보 세선에서 삭제 성공");
				session.setAttribute("login", dto);
				System.out.println("로그인 성공");
				nextPage = "login"; //login.jsp로 이동
			} else {
				System.out.println("로그인 실패");
				nextPage = "redirect:login"; //매핑된 get방식login 
			}
		} else {
			System.out.println("회원가입 정보 없음");
			nextPage = "redirect:member";
		}
		return nextPage;
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("login");
		System.out.println("로그아웃 성공");
		return "main";
	}
}
