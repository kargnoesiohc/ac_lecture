package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.SessionFactory;
import com.dao.EmpDAO;
import com.dto.Emp;

public class EmpService {
		EmpDAO dao;
		public EmpService() {
				// TODO Auto-generated constructor stub
				dao = new EmpDAO();
		}
		
		public List<Emp> EmpSelectAll() {
				SqlSession session = SessionFactory.getSession();
				try {
						List<Emp> list = dao.EmpSelectAll(session);
						return list;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
		} // end EmpSelectAll()

		public Emp EmpSelectByNo(int empno) {
				// TODO Auto-generated method stub
				SqlSession session = SessionFactory.getSession();
				try {
						Emp emp = dao.EmpSelectByNo(session, empno);
						return emp;
				} finally {
						// TODO: handle finally clause
						session.close();
				}
		} // end EmpSelectByNo()

		public void EmpInsert(Emp emp) {
				// TODO Auto-generated method stub
				SqlSession session = SessionFactory.getSession();
				try {
						dao.EmpInsert(session, emp);
						session.commit();
						System.out.println("Success Commit!");
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				
		}

		public void EmpUpdate(Emp emp) throws Exception {
				// TODO Auto-generated method stub
				SqlSession session = SessionFactory.getSession();
				try {
						dao.EmpUpdate(session, emp);
						session.commit();
						System.out.println("Success Commit!");
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				
		}

		public void EmpDelete(int empno) throws Exception {
				// TODO Auto-generated method stub
				SqlSession session = SessionFactory.getSession();
				try {
						dao.EmpDelete(session, empno);
						session.commit();
						System.out.println("Success Commit!");
				} finally {
						// TODO: handle finally clause
						session.close();
				}
				
		}
}
