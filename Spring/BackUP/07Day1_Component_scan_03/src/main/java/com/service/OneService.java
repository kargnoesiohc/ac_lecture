package com.service;

import org.springframework.stereotype.Service;

@Service("One")
public class OneService {
	public String one() {
		return "OneService.two() 호출";
	}
}
