package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	//PathVariable에 넣어준 키 값을 통해 value값을 넣어줌
	@RequestMapping("/board/name/{xxx}")
	public String aaa(@PathVariable("xxx") String name) { //파싱해온 name을 'xxx'키에 넣어줌
		System.out.println("@PathVariable('xxx') == " + name);
		return "main";
	}
	@RequestMapping("/board/name/{xxx}/age/{yyy}")
	public String bbb(@PathVariable("xxx") String name, @PathVariable("yyy") int age) {
		System.out.println("@PathVariable('xxx') == " + name + ", @PathVariable('yyy') == " + age);
		return "main";
	}
}
