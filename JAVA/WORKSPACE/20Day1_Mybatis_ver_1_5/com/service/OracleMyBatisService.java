package com.service;

import java.util.HashMap;
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

		
		public List<Dept> selectDynamicDeptno(Dept dept) throws Exception{
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						List<Dept> list = dao.selectDynamicDeptno(session, dept);
						return list;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
		} //end selectDynamicDeptno


		public List<Dept> selectDynamicChoose(HashMap<String, String> map) throws Exception {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						List<Dept> list = dao.selectDynamicChoose(session, map);
						return list;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				
				
				// TODO Auto-generated method stub
				
		}
		
		

}
