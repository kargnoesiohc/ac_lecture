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
				Dept dept;
				try {
						dept = dao.deptSelectOne(session, deptno);
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				return dept;
		}// end deptSelectOne()

		public List<Dept> deptSelectPlural(Dept dept) throws Exception {
				SqlSession session = MySqlSessionFactory.getSession();
				try {
						List<Dept> list = dao.deptSelectPlural(session, dept);
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
}
