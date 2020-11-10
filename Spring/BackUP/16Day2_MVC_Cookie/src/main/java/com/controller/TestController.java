package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/getCookie")
	public String getCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cookies = request.getCookies(); //저장된 모든 쿠키 가져오기
		for(Cookie c: cookies) {
			System.out.println(c.getName()+"\t"+c.getValue()); // key/value
		}
		return "hello";
	}
	
	@RequestMapping("/setCookie")
	public String setCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie c1 = new Cookie("myName", "홍길동"); //저장할 쿠키 생성 key/value
		Cookie c2 = new Cookie("age", "10");
		Cookie c3 = new Cookie("favorite", "악기");
		c1.setMaxAge(60*60); //쿠키의 생존시간 설정 (1시간, 60초*60)
		c2.setMaxAge(60*60); //쿠키의 생존시간 설정
		c3.setMaxAge(60*60); //쿠키의 생존시간 설정
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		return "hello";
		
		
	}
	
}
