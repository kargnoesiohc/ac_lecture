package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMybatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMybatisDAO dao;
	public OracleMyBatisService() {
		dao = new OracleMybatisDAO();
	}
	public List<Dept> selectAll() {
			SqlSession session = MySqlSessionFactory.getSession();
			try {
					List<Dept> list = dao.selectAll(session);
					return list;
		} finally {
				// TODO: handle finally clause
				session.close();
		}
	
			
		
	}// end selectAll()
	
	public Dept selectOne(int deptno){
			SqlSession session = MySqlSessionFactory.getSession();
			try {
				Dept dept = dao.selectOne(session, deptno);
				return dept;
		} finally {
				// TODO: handle finally clause
				session.close();
		}
	}//end selectOne()
	
	public Dept insert(Dept dept) {
			try {
					SqlSession session = MySqlSessionFactory.getSession();
					return dept;
		} finally {
				// TODO: handle finally clause
				session.close();
		}
			
	}
	


}
