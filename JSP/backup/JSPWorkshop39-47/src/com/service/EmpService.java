package com.service;

import java.util.ArrayList;
import java.util.HashMap;
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

	public List<EmpDTO> select() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<EmpDTO> list = null;
		try {
			list = dao.select(session);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
		return list;
	
	}//end select

	public EmpDTO selectEmp(int empno) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		EmpDTO dto = null;
		
		try {
			dto = dao.selectEmp(session,empno);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return dto;
	}

	public void insertEmp(EmpDTO dto) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		
		try {
			int n = dao.insertEmp(session, dto);
			if(n != 0) {
				session.commit();
			}
		} finally {
			// TODO: handle finally clause
			session.close();
		}
				
	}

	public void updateEmp(EmpDTO dto) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			int n = dao.updateEmp(session, dto);
			if(n != 0) {
				session.commit();
			}
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
				
		
	}
	
	
	
}
