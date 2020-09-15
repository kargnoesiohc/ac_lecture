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

	public List<EmpDTO> selectAllEmp() {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			List<EmpDTO> list = dao.selectAll(session);
			return list;
		} finally  {
			// TODO: handle exception
			session.close();
		}
		
	}

	public int insert(EmpDTO empdto) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		int num;
		try {
			num = dao.insert(session, empdto);
		} finally {
			// TODO: handle finally clause
			session.commit();
			session.close();
		}
		return num;
		
	}


}
