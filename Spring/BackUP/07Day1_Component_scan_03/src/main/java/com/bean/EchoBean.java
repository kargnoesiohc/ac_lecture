package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.OneService;
import com.service.TwoService;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Controller
public class EchoBean {
	
	//@AutoWired사용 또는 설정파일에서 주입 
	@Autowired
	OneService one;
	@Autowired
	TwoService two;

	public String one() {
		
		return one.one();
	}
	public String two() {
		
		return two.two();
	}
}
