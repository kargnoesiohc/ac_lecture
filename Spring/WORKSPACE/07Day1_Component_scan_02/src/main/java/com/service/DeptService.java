package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entity.DeptDTO;

@Service("service")  //클래스 이름 사용, id 지정 가능
//@Service
@Scope("prototype") //default == singleton
public class DeptService {
	@Autowired
	DeptDAO dao;
	
	public DeptDAO getDao() {
		return dao;
	}


	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	public DeptDTO getInfo() {
		return dao.getInfo();
	}
}
