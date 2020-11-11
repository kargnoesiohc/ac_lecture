package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService serivce;
	
	@RequestMapping("/memberAdd")
	public String memberAdd(MemberDTO m, RedirectAttributes	rttr) {
		serivce.memberAdd(m);
		rttr.addFlashAttribute("mesg","회원가입 성공");
		return "redirect:/";
	}
}
