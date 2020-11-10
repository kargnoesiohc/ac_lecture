package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberAdd {
	
	@RequestMapping("/memberAdd")
	public String memberAdd() {
		return "main";
	}
}
