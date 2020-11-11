package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class LoginController {
	@Autowired
	MemberService service;
	
	@RequestMapping("/login")
	public String login(@RequestParam Map<String, String> map, HttpSession session, RedirectAttributes rttr) {
		System.out.println(map);
		MemberDTO dto = service.login(map);
		System.out.println(dto);
		String next = "";
		if(dto != null) {
			session.setAttribute("login", dto); //dto에 userid, username만 들어있고 나머진 다 null
			rttr.addFlashAttribute("mesg", "로그인 성공");
			next = "redirect:/";
		} else {
			rttr.addFlashAttribute("mesg", "로그인 실패");
			next = "redirect:loginForm";
		}
		return next;
	}
}
