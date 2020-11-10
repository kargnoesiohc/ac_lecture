package com.controller;

import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	public String xxx(HttpServletRequest request) {
		Enumeration<String> keys = request.getHeaderNames();  //헤더 정보의 키 값만 가져오기
		while(keys.hasMoreElements()) { //다음 키 값이 있는지 검사
			String key = keys.nextElement(); //하나의 키 값 얻기
			String value = request.getHeader(key); //키에 해당하는 정보 얻기
			System.out.println(key+"/t"+value);
		}
		return "hello";
	}
}
