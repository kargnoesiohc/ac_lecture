package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	DeptDAO dao; //new가 사라지고 .xml에서 주입

	public DeptService(DeptDAO dao) {
		super();
		this.dao = dao;
	}
	
	public List<String> list() {
		return dao.list();
	}
}
