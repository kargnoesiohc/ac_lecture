package com.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	//@ModelAttribute 사용 안됨, 자동으로 모델 처리
	@RequestMapping("/main1")
	public String xxx(Model m) { //request 대신 model객체 사용
		System.out.println("xxx() 호출");
		m.addAttribute("username","홍길동");
		return "main1";
	}
	
	@RequestMapping("/main2")
	public String bbb(Map<String, Object> map) {//request 대신 Map사용
		map.put("address",  "서울");
		map.put("username", "홍길동");
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		map.put("list", list);
		return "main2";
	}
	
}
