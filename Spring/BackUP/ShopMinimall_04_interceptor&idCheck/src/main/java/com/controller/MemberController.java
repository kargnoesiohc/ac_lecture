package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService service;

	@RequestMapping("/memberAdd")
	public String memberAdd(MemberDTO m, RedirectAttributes rttr) {
		service.memberAdd(m);
		rttr.addFlashAttribute("mesg", "회원가입 성공");
		return "redirect:/";
	}

	@RequestMapping(value="/idCheck", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String idCheck(String userid) {
		int n = service.idCheck(userid);
		String mesg = "아이디 사용가능";
		if (n == 1) {
			mesg = "아이디 중복";
		}
		return mesg;
	}

	@RequestMapping("/loginCheck/myPage")
	public String myPage(HttpSession session, RedirectAttributes rttr) {
		//interceptor  -> /loginCheck
		String next = "";
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		System.out.println(dto);
		
		String userid = dto.getUserid();
		System.out.println(userid);
		dto = service.myPage(userid);
		session.setAttribute("login", dto);
			
		return "redirect:../myPage";
	}
	
	@RequestMapping("/loginCheck/memberUpdate")
	public String memberUpdate(MemberDTO dto, HttpSession session, RedirectAttributes rttr) {
		String next = "";
		if (dto != null) {
			int n = service.memberUpdate(dto);
			if (n > 0) {
				session.setAttribute("login", dto);
				rttr.addFlashAttribute("mesg", "업데이트 완료");
			} else {
				rttr.addFlashAttribute("mesg", "비밀번호가 다릅니다.");
			}
		}
		return "redirect:/myPage";
	}
	
}
