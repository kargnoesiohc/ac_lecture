package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	//동일 주소의 경우 파라미터를 이용하여 주소 매핑을 다르게 하는 예제
	
	@RequestMapping(value="/")
	public String xxx() {
		System.out.println("main() 호출");
		return "main";
	}
	
	@RequestMapping(value="/kkk", params ="aaa=bbb")
	public String xxx2() {
		System.out.println("a 호출");
		return "main";
	}
	
	@RequestMapping(value="/kkk", params ="aaa=ccc")
	public String xxx3() {
		System.out.println("b 호출");
		return "main";
	}
	
	@RequestMapping(value="/kkk", params ="xxx=aaa")
	public String xxx4() {
		System.out.println("c 호출");
		return "main";
	}
	
	@RequestMapping(value="/kkk", params ="xxx")
	public String xxx5() {
		System.out.println("d 호출");
		return "main";
	}

}
