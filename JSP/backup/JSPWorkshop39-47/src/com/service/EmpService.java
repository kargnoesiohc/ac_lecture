package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.dto.PageDTO;

public class EmpService {
	EmpDAO dao;
	public EmpService() {
		// TODO Auto-generated constructor stub
		dao = new EmpDAO();
	}

	public PageDTO select(String searchName, String searchValue, int curPage) {
		
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("searchName",searchName);
		map.put("searchValue",searchValue);
		
		SqlSession session = MySqlSessionFactory.getSession();
		PageDTO pDTO = null;
		try {
			pDTO = dao.select(session,map,curPage);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
		return pDTO;
	
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
	}// end selectEmp

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
				
	}// end insertEmp

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
	}// updateEmp

	public void deleteEmp(int empno) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			int n = dao.deleteEmp(session, empno);
			if(n != 0) {
				session.commit();
			}
		} finally {
			// TODO: handle finally clause
			session.close();
		}
	}//end deleteEmp

	public List<EmpDTO> selectOrder(String order) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("order",order);
		SqlSession session = MySqlSessionFactory.getSession();
		List<EmpDTO> list = null;
		try {
			list = dao.selectOrder(session,map);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
		return list;
	}

}
