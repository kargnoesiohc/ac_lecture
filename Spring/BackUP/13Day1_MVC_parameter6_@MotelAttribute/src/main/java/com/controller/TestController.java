package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@ModelAttribute("xxx") //다른 함수의 사용 객체가 됨, RequestMapping보다 먼저임
	public ArrayList<String> getList() {
		System.out.println("getList() 호출");
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return list; //'xxx'라는 키로 List 저장
	}
	
	@RequestMapping("/main1")
	//@ModelAttribute로 만든 'xxx'키를 가진 함수가 있을 경우 실행 후 리스트에 담음, 없으면 새로운 리스트 생성
	public String xxx(@ModelAttribute("xxx") ArrayList<String> list) { 
		System.out.println("main1 추가 요청 작업");
		return "main1";
	}
	
	@RequestMapping("/main2")	
	//@ModelAttribute로 만든 'xxx'키를 가진 함수가 있을 경우 실행 후 리스트에 담음, 없으면 새로운 리스트 생성
	public String xxx2(@ModelAttribute("xxx") ArrayList<String> list) { 
		System.out.println("main2 추가 요청 작업");
		return "main2";
	}
}
