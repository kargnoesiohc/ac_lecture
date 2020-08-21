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

		public List<Dept> deptSelectAll() {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						List<Dept> list = dao.deptSelectAll(session);
						return list;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
		}// end deptSelectAll()

		public Dept deptSelectOne(int deptno) throws Exception {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						Dept dept = dao.deptSelectOne(session, deptno);
						return dept;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				
		}// end deptSelectOne()

		public List<Dept> deptSelectByNameAndLoc(HashMap<String, String> map) throws Exception {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						List<Dept> list = dao.deptSelectByNameAndLoc(session, map);
						return list;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
		}// end deptSelectPlural()

		public void deptInsert(Dept dept) {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						dao.deptInsert(session, dept);
						session.commit();
						System.out.println("Success Commit!");

				} finally {
						session.close();
						// TODO: handle finally clause
				} // end deptInsert()
		}

		public void deptUpdate(Dept dept) throws Exception {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						dao.deptUpdate(session, dept);
						session.commit();
						System.out.println("Success Commit!");

				} finally {
						session.close();
						// TODO: handle finally clause
				}
		}// end deptUpdate()
		
		public void deptDelete(int deptno) throws Exception {
						SqlSession session = MySqlSessionFactory.getSession();
						try {
								dao.deptDelete(session, deptno);
								session.commit();
								System.out.println("Success Commit!");

						} finally {
								session.close();
								// TODO: handle finally clause
						}
		}//end deptDelete()

		public int deptRecordCount() {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						int result = dao.deptRecordCount(session);
						return result;
				} finally {
						session.close();
				// TODO Auto-generated method stub
				}
		}

		public List<Dept> deptSelectByHashMap(HashMap<String, Integer> map) throws Exception {
				SqlSession session = MySqlSessionFactory.getSession();
				// TODO Auto-generated method stub
				try {
						List<Dept> list = dao.deptSelectByHashMap(session,map);
						return list;

				} finally {
						// TODO: handle finally clause
						session.close();
				}
		}

		public List<Dept> deptSelectByDeptNoIn(HashMap<String, Integer> map) throws Exception {
				// TODO Auto-generated method stub
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						List<Dept> list = dao.deptSelectByDeptNoIn(session, map);
						return list;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
			
		}

		public HashMap<String,Dept> deptSelectByDeptnoHashMap(int deptno) throws Exception {
				// TODO Auto-generated method stub
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						HashMap<String,Dept> map = dao.deptSelectByDeptnoHashMap(session, deptno);
						return map;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
		}
}
