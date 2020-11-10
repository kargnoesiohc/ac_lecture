package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	// 1. 기본
	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa() 호출");
		return "main";
	}

	// 2. 매핑 여러개
	@RequestMapping(value = { "/bbb1", "/bbb2" })
	public String bbb() {
		System.out.println("bbb() 호출");
		return "main";
	}

	// 3. ccc로 시작
	@RequestMapping("/ccc*")
	public String ccc() {
		System.out.println("ccc() 호출");
		return "main";
	}

	// 4. /ddd/아무거나 가능. 단 1개만 가능, ex) /ddd/ccc는 가능, /ddd/ccc/aaa는 불가능
	@RequestMapping("/ddd/*")
	public String ddd() {
		System.out.println("ddd() 호출");
		return "main";
	}

	// 5. /eee/무제한 가능
	@RequestMapping("/eee/**")
	public String eee() {
		System.out.println("eee() 호출");
		return "main";
	}

	// 6. /fff/무제한/ggg 시작과 끝이 맞아야함
	@RequestMapping("/fff/**/ggg")
	public String fff() {
		System.out.println("fff() 호출");
		return "main";
	}
	
	// 7. Restful
	@RequestMapping("/hhh/{userid}/xxx/{passwd}")
	public String hhh() {
		System.out.println("hhh() 호출");
		return "main";
	}
}
