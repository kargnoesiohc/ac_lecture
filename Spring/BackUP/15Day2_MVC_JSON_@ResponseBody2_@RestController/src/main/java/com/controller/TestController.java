package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.LoginDTO;

@RestController //비동기 전용 Controller //@ResponseBody 필요없음
public class TestController {
	
	/*
	 * @RequestMapping("/eee") public String eee() {
	 * System.out.println("eee() 호출 -> mesg : "); return "eee() call"; }
	 * 
	 * @RequestMapping("/fff") public String fff(@RequestBody String mesg) {
	 * System.out.println("fff() 호출 -> mesg : " + mesg ); return "fff() call"; }
	 */
	
	@RequestMapping("/aaa")
	@ResponseBody
	public LoginDTO aaa() {
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
		
	}
	
	@RequestMapping("/bbb")
	public ArrayList<LoginDTO> bbb() {
		ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
		list.add(new LoginDTO("홍길동1", "10"));
		list.add(new LoginDTO("홍길동2", "20"));
		list.add(new LoginDTO("홍길동3", "30"));
		return list;
	}
	
	@RequestMapping("/ccc")
	public HashMap<String, ArrayList<LoginDTO>> ccc() {
		HashMap<String, ArrayList<LoginDTO>> map = new HashMap<String, ArrayList<LoginDTO>>();
		ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
		list.add(new LoginDTO("홍길동1","10"));
		list.add(new LoginDTO("홍길동2","20"));
		list.add(new LoginDTO("홍길동3","30"));
		ArrayList<LoginDTO> list2 = new ArrayList<LoginDTO>();
		list2.add(new LoginDTO("유관순1", "10"));
		list2.add(new LoginDTO("유관순2", "10"));
		list2.add(new LoginDTO("유관순3", "10"));
		map.put("one",list);
		map.put("two",list2);
		return map;
	}
	
	@RequestMapping("/ddd")
	public String ddd(String mesg) {
		System.out.println("ddd() 호출");
		return "ddd() call";
	}
}
