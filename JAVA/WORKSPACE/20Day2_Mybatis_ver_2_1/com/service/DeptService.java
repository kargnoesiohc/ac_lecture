package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.DeptDAO;
import com.dto.Dept;
import com.dto.Emp;

public class DeptService {

		DeptDAO deptDao;

		public DeptService() {
				deptDao = new DeptDAO();
		}
		
		public List<Dept> multiSelect(List<Integer> deptnoes){
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						List<Dept> list = deptDao.multiSelect(session, deptnoes);
						return list;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
		}

		public void multiUpdateLoc(List<Integer> deptno) throws Exception {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						deptDao.multiUpdateLoc(session, deptno);
						session.commit();
						System.out.println("Success Commit!");
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				
		}

		public List<Dept> multiDelete(List<Integer> deptno) throws Exception {
				// TODO Auto-generated method stub
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						deptDao.multiDelete(session, deptno);
						session.commit();
						System.out.println("Success Commit!");
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				return null;
		}

		public void multiInsertAll(List<Dept> depts) {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						deptDao.multiInsertAll(session, depts);
						session.commit();
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				
		}

		public List<Dept> selectTopN(int offset, int limit) {
				// TODO Auto-generated method stub
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						List<Dept> list = deptDao.selectTopN(session, offset, limit);
						return list;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				
		}


}
