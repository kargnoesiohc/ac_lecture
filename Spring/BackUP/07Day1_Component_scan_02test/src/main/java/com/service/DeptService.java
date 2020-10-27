package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entity.DeptDTO;

import lombok.Data;

@Service("service")
public @Data class DeptService {
	@Autowired
	DeptDAO dao;
	
	public DeptDTO getDeptDTO() {
		return dao.getDeptDTO();
	}
  	
	
	
}
