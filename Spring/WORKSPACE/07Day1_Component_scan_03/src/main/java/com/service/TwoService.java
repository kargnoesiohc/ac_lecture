package com.service;

import org.springframework.stereotype.Service;

@Service("Two")
public class TwoService {
	public String two() {
		return "TwoService.two() 호출";
	}
}
