package com.service;

import org.springframework.stereotype.Component;

@Component //자동으로 생성해달라
public class DeptService {
	public String getService() {
		return "DeptService.getService() 호출";
	}
}
