package com.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {

	EmpDAO dao;
	
	public EmpService() {
		// TODO Auto-generated constructor stub
		dao = new EmpDAO();
	}
	
	public List<EmpDTO> selectAll() {
		
		SqlSession session = MySqlSessionFactory.getSession();
		List<EmpDTO> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			// TODO: handle finally clause
			session.close();
		} 
		
		return list;
		
	}
}
